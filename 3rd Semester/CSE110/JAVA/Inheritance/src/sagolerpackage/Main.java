package sagolerpackage;

public class Main {
    public static void main(String[] args) {
        Employee a = new Employee();
        System.out.println(a.salary());
        
        a = new PartTime();
        System.out.println(a.salary());
        
        a = new Fulltime();
        System.out.println(a.salary());
    }
}
