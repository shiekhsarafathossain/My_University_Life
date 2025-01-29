#include <stdio.h>
#include <stdlib.h>

struct Process {
    int id;
    int burst_time;
    int waiting_time;
    int turnaround_time;
    int priority;
};

// Function
void fcfs(struct Process processes[], int n);
void sjf(struct Process processes[], int n);
void round_robin(struct Process processes[], int n, int time_quantum);
void priority_scheduling(struct Process processes[], int n);
void calculate_turnaround_time(struct Process processes[], int n);
void display_gantt_chart(struct Process processes[], int n);
void compare_algorithms(struct Process processes[], int n);

int main() {
    int choice, n, time_quantum;

    printf("Enter number of processes: ");
    scanf("%d", &n);
    struct Process processes[n];

    // Input process burst times
    for (int i = 0; i < n; i++) {
        printf("Enter burst time for process %d: ", i + 1);
        scanf("%d", &processes[i].burst_time);
        processes[i].id = i+ 1;
        processes[i].waiting_time = 0;
        processes[i].turnaround_time = 0;
        processes[i].priority = 0;  // Default priority, will be set later for priority scheduling
    }

    while (1) {
        printf("\n1. FCFS\n2. SJF\n3. Round Robin\n4. Priority Scheduling\n5. Compare Algorithms\n6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: fcfs(processes, n); break;
            case 2: sjf(processes, n); break;
            case 3:
                printf("Enter time quantum: ");
                scanf("%d", &time_quantum);
                round_robin(processes, n, time_quantum); break;
            case 4: priority_scheduling(processes, n); break;
            case 5: compare_algorithms(processes, n); break;
            case 6: exit(0); break;
            default: printf("Invalid choice\n"); break;
        }
    }

    return 0;
}

// FCFS Algorithm
void fcfs(struct Process processes[], int n) {
    int total_waiting_time = 0, total_turnaround_time = 0;

    // Calculate waiting times
    processes[0].waiting_time = 0;
    for (int i = 1; i < n; i++) {
        processes[i].waiting_time = processes[i - 1].waiting_time + processes[i - 1].burst_time;
        total_waiting_time += processes[i].waiting_time;
    }

    // Calculate turnaround times
    calculate_turnaround_time(processes, n);
    for (int i = 0; i < n; i++) {
        total_turnaround_time += processes[i].turnaround_time;
    }

    // Display results
    printf("\nFCFS Scheduling:\n");
    display_gantt_chart(processes, n);
    printf("Average Waiting Time: %.2f\n", (float)total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", (float)total_turnaround_time / n);
}

// SJF Algorithm 
void sjf(struct Process processes[], int n) {
    int total_waiting_time = 0, total_turnaround_time = 0;
    struct Process temp;

    // Sort processes by burst time
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (processes[i].burst_time > processes[j].burst_time) {
                temp = processes[i];
                processes[i] = processes[j];
                processes[j] = temp;
            }
        }
    }

    // Calculate waiting times
    processes[0].waiting_time = 0;
    for (int i = 1; i < n; i++) {
        processes[i].waiting_time = processes[i - 1].waiting_time + processes[i - 1].burst_time;
        total_waiting_time += processes[i].waiting_time;
    }

    // Calculate turnaround times
    calculate_turnaround_time(processes, n);
    for (int i = 0; i < n; i++) {
        total_turnaround_time += processes[i].turnaround_time;
    }

    // Display results
    printf("\nSJF Scheduling (Non-preemptive):\n");
    display_gantt_chart(processes, n);
    printf("Average Waiting Time: %.2f\n", (float)total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", (float)total_turnaround_time / n);
}

// Round Robin Algorithm
void round_robin(struct Process processes[], int n, int time_quantum) {
    int total_waiting_time = 0, total_turnaround_time = 0;
    int remaining_burst_time[n];

    // Initialize remaining burst times
    for (int i = 0; i < n; i++) {
        remaining_burst_time[i] = processes[i].burst_time;
    }

    int time = 0, done = 0;
    while (done < n) {
        for (int i = 0; i < n; i++) {
            if (remaining_burst_time[i] > 0) {
                if (remaining_burst_time[i] > time_quantum) {
                    time += time_quantum;
                    remaining_burst_time[i] -= time_quantum;
                } else {
                    time += remaining_burst_time[i];
                    processes[i].waiting_time = time - processes[i].burst_time;
                    remaining_burst_time[i] = 0;
                    done++;
                }
            }
        }
    }

    // Calculate turnaround times
    calculate_turnaround_time(processes, n);
    for (int i = 0; i < n; i++) {
        total_waiting_time += processes[i].waiting_time;
        total_turnaround_time += processes[i].turnaround_time;
    }

    // Display results
    printf("\nRound Robin Scheduling (Time Quantum = %d):\n", time_quantum);
    display_gantt_chart(processes, n);
    printf("Average Waiting Time: %.2f\n", (float)total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", (float)total_turnaround_time / n);
}

// Priority Scheduling Algorithm (Non-preemptive)
void priority_scheduling(struct Process processes[], int n) {
    int total_waiting_time = 0, total_turnaround_time = 0;
    struct Process temp;

    // Input priorities
    for (int i = 0; i < n; i++) {
        printf("Enter priority for process %d: ", i + 1);
        scanf("%d", &processes[i].priority);
    }

    // Sort processes by priority (lower priority value -> higher priority)
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (processes[i].priority > processes[j].priority) {
                temp = processes[i];
                processes[i] = processes[j];
                processes[j] = temp;
            }
        }
    }

    // Calculate waiting times
    processes[0].waiting_time = 0;
    for (int i = 1; i < n; i++) {
        processes[i].waiting_time = processes[i - 1].waiting_time + processes[i - 1].burst_time;
        total_waiting_time += processes[i].waiting_time;
    }

    // Calculate turnaround times
    calculate_turnaround_time(processes, n);
    for (int i = 0; i < n; i++) {
        total_turnaround_time += processes[i].turnaround_time;
    }

    // Display results
    printf("\nPriority Scheduling:\n");
    display_gantt_chart(processes, n);
    printf("Average Waiting Time: %.2f\n", (float)total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", (float)total_turnaround_time / n);
}

//calculate turnaround times
void calculate_turnaround_time(struct Process processes[], int n) {
    for (int i = 0; i < n; i++) {
        processes[i].turnaround_time = processes[i].waiting_time + processes[i].burst_time;
    }
}

//display the Gantt Chart
void display_gantt_chart(struct Process processes[], int n) {
    printf("Gantt Chart: ");
    for (int i = 0; i < n; i++) {
        printf("| P%d ", processes[i].id);
    }
    printf("|\n");
}

//compare algorithms
void compare_algorithms(struct Process processes[], int n) {
    printf("\nComparing Algorithms...\n");
    fcfs(processes, n);
    sjf(processes, n);
    int time_quantum;
    printf("Enter time quantum for Round Robin: ");
    scanf("%d", &time_quantum);
    round_robin(processes, n, time_quantum);
    priority_scheduling(processes, n);
}
