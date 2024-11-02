package question5;

import java.io.Serializable;
import java.util.ArrayList;

class Patient implements Serializable {
    ArrayList <Doctor> dlist = new <Doctor> ArrayList();
    int Id;
    String Name;
    int Telno;
    String Address;
    int Age;
    String Sex;
    int RoomNo;

    public Patient(int Id, String Name, int Telno, String Address, int Age, String Sex, int RoomNo) {
        this.Id = Id;
        this.Name = Name;
        this.Telno = Telno;
        this.Address = Address;
        this.Age = Age;
        this.Sex = Sex;
        this.RoomNo = RoomNo;
    }
    
    public void PayBills(double bills){
        System.out.println("Bill = "+bills);
    }
    
    public void addDoctor(Doctor d){
        dlist.add(d);
    }
    
}
