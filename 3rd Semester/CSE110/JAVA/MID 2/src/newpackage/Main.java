package newpackage;
import java.util.ArrayList;

class Customer {
    private int cusId;
    private String name;

    public Customer(int cusId, String name) {
        this.cusId = cusId;
        this.name = name;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer [cusId=" + cusId + ", name=" + name + "]";
    }
}

class Teller {
    private int id;
    private String date;
    private int slotId;
    private ArrayList<Customer> customerList;

    public Teller(int id, String date) {
        this.id = id;
        this.date = date;
        this.slotId = 0;
        this.customerList = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        if (slotId < 10) {
            customerList.add(c);
            slotId++;
        } else {
            System.out.println("Slots are not available");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teller [id=").append(id)
          .append(", date=").append(date)
          .append(", slotId=").append(slotId)
          .append(", customerList=").append(customerList)
          .append("]\n");
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            customerList.add(new Customer(i, "Customer " + i));
        }

        Teller teller = new Teller(1, "2023-08-08");

        for (Customer customer : customerList) {
            teller.addCustomer(customer);
        }

        System.out.println(teller);
    }
}
