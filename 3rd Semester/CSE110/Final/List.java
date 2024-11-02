package lab09_problem04;

import java.io.Serializable;

public class List implements Serializable{

    private int Index;
    private int MaxSize;
    private int[] Data;

    public List() {
        MaxSize = 10;
        Index = -1;
        Data = new int[MaxSize];
    }

    public List(int MaxSize) {
        this.MaxSize = MaxSize;
        Index = -1;
        Data = new int[MaxSize];
    }

    public void push(int data) {
        if (Index < MaxSize - 1) {
            Index++;
            Data[Index] = data;
        } else {
            System.out.println("List is full!");
        }
    }

    public void pop() {
        if (Index >= 0) {
            Index--;
        } else {
            System.out.println("List is empty!");
        }
    }

    public int top() {
        if (Index >= 0) {
            return Data[Index];
        } else {
            System.out.println("List is empty!");
            return -1;
        }
    }

    public void display() {
        if (Index >= 0) {
            System.out.print("List: ");
            for (int i = 0; i <= Index; i++) {
                System.out.print(Data[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("List is empty!");
        }
    }
    
}//List class ends
