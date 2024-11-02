package problem1;

import java.util.ArrayList;
import java.util.Calendar;

public class Teller {
    ArrayList <Customer> clist;
    int id;
    String date;
    int slotId = 0;
    static int numofcus;
    
    Teller(){
        
    }
    
    Teller(int id, String date){
        this.id = id;
        this.date = date;
        clist = new ArrayList <Customer>();
        
    }
    
    void addcustomer(Customer c){
        if(numofcus < 10){
        clist.add(c);
        slotId++;
        numofcus++;
        }
        else{
            System.out.println("Slot are not available. ");
        }
    }
    
    @Override
    public String toString(){
        String str = "Teller Id: "+id+
               "\nDate: "+date+
                "\nSlot Id: "+slotId+
                "\nCustomer List: "+clist;
        return str;
    }
    
}
