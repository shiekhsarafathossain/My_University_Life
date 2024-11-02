/*Understanding meaningful example of Aggregation
In this example, Employee has an object of Address,
address object contains its own informations such as city,
state, country etc. In such case relationship is 
Employee HAS-A address.*/
package lab4;

class Address{
    String city;
    String state;
    String country;
    
    Address(String city, String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
    
   
    void display(){
        System.out.println("City: "+city+"\nState: "+state+"\nCountry: "+country);
    }
    
}

class Emp{
    int id;
    String name;
    Address a;
    Emp(int id, String name,Address a){
        this.id = id;
        this.name = name;
        this.a = a; 
    }
    
    void display(){
        System.out.println("ID: "+id+"\nName: "+name);
        a.display();
      
        
    }
}

public class Employee {
    public static void main(String[] args) {
        Address a1 = new Address("Uttarkhan","Dhaka","Bangladesh");
        Emp e1 = new Emp(2022,"Sarafat",a1);
        e1.display();
    }
}
