package newpackage2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Patient> patients = new ArrayList <>();
    //    ArrayList <IndoorPatient> ilist = new ArrayList <IndoorPatient>();
        int i = 0 ;
        patients.add(new OutdoorPatient(101,"Raya",1000));
        patients.add(new OutdoorPatient(102,"saad",2500));
        patients.add(new IndoorPatient(1001,"Sawda",15000,3500,500,700));
        patients.add(new IndoorPatient(1001,"Umaira",800,3990,6660,790));
        
        System.out.println(patients.get(i).bill());
        System.out.println(patients.get(i).toString());
        i++;
        System.out.println();
        System.out.println();
        System.out.println(patients.get(i).bill());
        System.out.println(patients.get(i).toString());
        i++;
        System.out.println();
        System.out.println();
        System.out.println(patients.get(i).bill());
        System.out.println(patients.get(i).toString());
        i++;
        System.out.println();
        System.out.println();
        System.out.println(patients.get(i).bill());
        System.out.println(patients.get(i).toString());
        i++;
        
        double avgbill = 0;
        int count=0;
        for (int j = 0; j < patients.size(); j++) {
            if(patients.get(j) instanceof IndoorPatient){
                avgbill = avgbill + patients.get(j).bill();
                count++;
            }
           
        }
        System.out.println(count);
        System.out.println("Average Bill of Indoor Patient = "+(avgbill/count));
        
    }
}
