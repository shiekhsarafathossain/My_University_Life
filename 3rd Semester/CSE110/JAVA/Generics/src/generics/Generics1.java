package generics;

import java.util.ArrayList;

class MyList <T>{
    MyList(){
        
    }
    ArrayList <T> list = new ArrayList();
    
    public void add(T element){
        list.add(element);
    }
    public void remove(int ind){
        list.remove(ind);
    }
}

public class Generics1 {
    public static void main(String[] args) {
        MyList l1 = new MyList();
        MyList l2 = new MyList();
        l2.add(444);
        l2.add(466);
        
        l1.add("Sarafat Hossain Saifullah");
        l1.add(44444);
        System.out.println(l1.list.get(0));
        System.out.println(l1.list.get(1));
        int i = (int) l2.list.get(0);
    }
}
