package lab9;

import java.io.*;

class List implements Serializable {

    int Index;
    int MaxSize;
    int[] Data;

    public List() {
        MaxSize = 10;
        Index = -1;
        Data = new int[MaxSize];
    }

    public List(int MaxSize) {
        Index = -1;
        this.MaxSize = MaxSize;
        Data = new int[this.MaxSize];
    }

    public void push(int data) {
        Index++;
        Data[Index] = data;
    }

    public void pop() {
        Data[Index] = 0;
        Index--;
    }

    public void display() {
        for (int i = 0; i < MaxSize; i++) {
            System.out.print(Data[i]);
            System.out.print(" ");
        }
    }

    public int top() {
        return Data[Index];
    }

}

public class LabProblem4 {

    public static void main(String[] args) throws Exception{
        
        List l1 = new List();
        
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.push(4);
        l1.push(5);
        l1.display();
        System.out.println("");
        l1.pop();
        l1.display();

        List l2 = new List(2);
        System.out.println("");
        l2.push(100);
        l2.push(200);
        System.out.println(l2.top());
        
        List l3 = new List(3);
        
        l3.push(1000);
        l3.push(2000);
        l3.push(3000);
        l3.display();
        System.out.println("");
        System.out.println(l3.top());
        
        List l4 = new List();
        
        l4.push(10000);
        l4.display();
        
        List l5 = new List();
        l5.push(500000);
        System.out.println("");
        System.out.println(l5.top());
        
        
        FileOutputStream f = new FileOutputStream("Lab08_04.dat");
        
        ObjectOutputStream w = new ObjectOutputStream(f);
        
        w.writeObject(l1);
        w.writeObject(l2);
        w.writeObject(l3);
        w.writeObject(l4);
        w.writeObject(l5);
        w.close();
        f.close();
        
        /*
        FileInputStream f1 = new FileInputStream("Lab08_04.dat");
        ObjectInputStream w1 = new ObjectInputStream(f1);
        
        
        
            List p1 = (List) w1.readObject();
            p1.display();
            System.out.println("");
            
            List p2 = (List) w1.readObject();
            p2.display();
            System.out.println("");
            List p3 = (List) w1.readObject();
            p3.display();
            System.out.println("");
            List p4 = (List) w1.readObject();
            p4.display();
            System.out.println("");
            List p5 = (List) w1.readObject();
            p5.display();
            System.out.println("");
            w1.close();
        
*/
        
    }
}
