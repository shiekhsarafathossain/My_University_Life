package problem1;

public class Customer {

    int cusId;
    String name;

    Customer() {

    }

    Customer(int cusId, String name) {
        this.cusId = cusId;
        this.name = name;
    }
    
    @Override
    public String toString() {
        String str = "\n\t\nCustomer ID: "+cusId+"\n\t\nCustomer Name: "+name;
        
        return str;
    }
}
