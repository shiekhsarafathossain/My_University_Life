package question5;

import java.io.Serializable;
import java.util.ArrayList;

public class Doctor implements Serializable {

    ArrayList<Patient> plist = new <Patient> ArrayList();
    int DocId;
    String Name;
    String Departmant;
    String Specialization;
    int PhNo;
    String Address;

    Doctor(int DocId, String Name, String Departmant, String Specialization, int PhNo, String Address) {
        this.DocId = DocId;
        this.Name = Name;
        this.Departmant = Departmant;
        this.Specialization = Specialization;
        this.PhNo = PhNo;
        this.Address = Address;
    }

    public void PrescribeMedicines(String pm) {
        System.out.println(pm);
    }

    public void CheckReports(String cr) {
        System.out.println(cr);
    }

    public void PrescribeTests(String pt) {
        System.out.println(pt);
    }

    public void DrawSalary(double sal) {
        System.out.println("Salary = " + sal);
    }
    
    public void addPatient(Patient p){
        plist.add(p);
    }

}
