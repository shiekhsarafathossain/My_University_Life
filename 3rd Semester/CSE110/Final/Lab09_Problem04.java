package lab09_problem04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Lab09_Problem04 {

    public static void main(String[] args) {
        
        String dir = "Enter Your Directory";
        
        List[] lists = new List[5];
        for (int i = 0; i < 5; i++) {
            lists[i] = new List(10);
            for (int j = 0; j < 10; j++) {
                lists[i].push((int) (Math.random() * 100));
            }
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir + "\\Lab09_04.dat"));
            for (int i = 0; i < 5; i++) {
                oos.writeObject(lists[i]);
            }
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dir + "\\Lab09_04.dat"));
            for (int i = 0; i < 5; i++) {
                List list = (List) ois.readObject();
                list.display();
            }
            ois.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }//main() ends
    
}//class ends
