#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

#define NUM_PHILOSOPHERS 5

sem_t chopsticks[NUM_PHILOSOPHERS]; // Semaphores to represent chopsticks

void* philosopher(void* num) {
    int id = *(int *)num; // Get philosopher's ID
    while (1) {
        printf("Philosopher %d is thinking.\n", id);
        sleep(1); // Thinking (simulated by sleep)

        // Alternating behavior to avoid deadlock
        if (id % 2 == 0) {
            sem_wait(&chopsticks[(id + 1) % NUM_PHILOSOPHERS]); // Pick up right chopstick first for even philosophers
            sem_wait(&chopsticks[id]); // Pick up left chopstick
        } else {
            sem_wait(&chopsticks[id]); // Pick up left chopstick first for odd philosophers
            sem_wait(&chopsticks[(id + 1) % NUM_PHILOSOPHERS]); // Pick up right chopstick
        }

        printf("Philosopher %d is eating.\n", id);
        sleep(2); // Eating (simulated by sleep)

        // Put down chopsticks
        sem_post(&chopsticks[id]);
        sem_post(&chopsticks[(id + 1) % NUM_PHILOSOPHERS]);

        printf("Philosopher %d is done eating.\n", id);
    }
}

int main() {
    pthread_t philosophers[NUM_PHILOSOPHERS];
    int ids[NUM_PHILOSOPHERS];

    // Initialize semaphores (chopsticks)
    for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
        sem_init(&chopsticks[i], 0, 1);
    }

    // Create philosopher threads
    for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
        ids[i] = i;
        pthread_create(&philosophers[i], NULL, philosopher, &ids[i]);
    }

    // Join philosopher threads
    for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
        pthread_join(philosophers[i], NULL);
    }

    // Destroy semaphores
    for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
        sem_destroy(&chopsticks[i]);
    }

    return 0;
}
