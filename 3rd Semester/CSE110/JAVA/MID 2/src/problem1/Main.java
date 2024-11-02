package problem1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> clist = new ArrayList<>();

        for (int i = 1; i <= 11; i++) {
            clist.add(new Customer(i + 100, "Customer " + i));
        }

        Teller t = new Teller(202, "2022-3-25");

        for (Customer list : clist) {
            t.addcustomer(list);
        }
        
        System.out.println(t.toString());
    }
}
