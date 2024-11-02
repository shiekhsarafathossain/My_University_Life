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

public class LabProblem1 {
    
    static Icecream[] IcecreamArray = new Icecream[5]; 
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        
        for (int i = 0; i < IcecreamArray.length; i++) {
            
            
            System.out.print("Enter Icecream Type: ");
            String icecreamType = input.nextLine();
            System.out.print("Enter Icecream Company: ");
            String icecreamCompany = input.nextLine();
            System.out.print("Enter Icecream Price: ");
            double icecreamPrice = input.nextDouble();
            input.nextLine();
            
            IcecreamArray[i] = new Icecream(icecreamType,icecreamCompany,icecreamPrice);
            System.out.println(IcecreamArray[i].toString());
            
            }
        
            System.out.println();
            System.out.println();
            
            System.out.print("Search Company By Name: ");
            String company = input.nextLine();
            System.out.println( company);
            searchByCompany(company);
        }
    static void searchByCompany(String company){
                for (int i = 0; i < IcecreamArray.length; i++) {
                   if(company.equals(IcecreamArray[i].getIcecreamCompany())){
                       System.out.println(IcecreamArray[i].toString());
                   }
                   
                }
    }
}
