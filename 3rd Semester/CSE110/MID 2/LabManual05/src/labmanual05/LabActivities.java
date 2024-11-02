package labmanual05;
import java.util.Scanner;
class Icecream{
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;
    
    Icecream(){
        
    }
    
    Icecream(String itype,String icom,double iprice){
        icecreamType = itype;
        icecreamCompany = icom;
        icecreamPrice = iprice;
    }
    
    void setIcecreamType(String icecreamType){
        this.icecreamType = icecreamType;
    }
    
    String getIcecreamType(){
        return icecreamType;
    }
    
    void setIcecreamCompany(String icecreamCompany){
        this.icecreamCompany = icecreamCompany;
    }
    
    String getIcecreamCompany(){
        return icecreamCompany;
    }
    
    void setIcecreamPrice(double icecreamPrice){
        this.icecreamPrice = icecreamPrice;
    }
    
    double getIcecreamPrice(){
        return icecreamPrice;
    }
    
    public String toString(){
        String str = "Icecream Type: "+icecreamType+"\nIcecream Company: "+icecreamCompany+"\nIcecream Price: "+icecreamPrice;
        
        return str;
    }
    
    public boolean equal(Icecream I){
        if(icecreamPrice == I.icecreamPrice){
            return true;
        }
        else 
            return false;
    }
    
    int compareTo(Icecream I){
        if(icecreamPrice > I.icecreamPrice){
            return 1;
        }
        
        else if(icecreamPrice == I.icecreamPrice){
            return 0;
        }
        
        else
            return -1;
    }
}

public class LabActivities {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String icecreamType;
        String icecreamCompany;
        double icecreamPrice;
        
        Icecream i1,i2;
        
        i1 = new Icecream();
        
        System.out.print("Icecream Type: ");
        icecreamType = input.nextLine();
        System.out.print("Icecream Company: ");
        icecreamCompany = input.nextLine();
        System.out.print("Icecream Price: ");
        icecreamPrice = input.nextDouble();
        
        i1.setIcecreamType(icecreamType);
        i1.setIcecreamCompany(icecreamCompany);
        i1.setIcecreamPrice(icecreamPrice);
        
        System.out.println(i1.toString());
        
        input.nextLine();
        System.out.print("Icecream Type: ");
        icecreamType = input.nextLine();
        System.out.print("Icecream Company: ");
        icecreamCompany = input.nextLine();
        System.out.print("Icecream Price: ");
        icecreamPrice = input.nextDouble();
        
        i2 = new Icecream(icecreamType,icecreamCompany,icecreamPrice);
        System.out.println(i2.toString());
        
        System.out.println(i1.equal(i2));
        System.out.println("");
        System.out.println(i1.compareTo(i2));
        
        Icecream[] IcecreamArray = new Icecream[10];
        
        for (int i = 0; i < 10; i++) {
            IcecreamArray[i] = new Icecream();
            
            input.nextLine();
            System.out.print("Icecream Type: ");
            icecreamType = input.nextLine();
            System.out.print("Icecream Company: ");
            icecreamCompany = input.nextLine();
            System.out.print("Icecream Price: ");
            icecreamPrice = input.nextDouble();
            
            IcecreamArray[i].setIcecreamType(icecreamType);
            IcecreamArray[i].setIcecreamCompany(icecreamCompany);
            IcecreamArray[i].setIcecreamPrice(icecreamPrice);
            System.out.println(IcecreamArray[i].toString());
        }
    }
}
