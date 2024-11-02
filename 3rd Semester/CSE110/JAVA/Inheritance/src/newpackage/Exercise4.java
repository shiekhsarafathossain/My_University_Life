package newpackage;


class Employee{
    double salary;
    
    Employee(double salary){
        this.salary = salary;
    }
    
    void work(){
        System.out.println("Working as an Empoloyee");
    }
    
    double getSalary(){
        return salary;
    }
    
}

class HRmanager extends Employee{
    HRmanager(double salary){
        super(salary);
    }
    @Override
    void work(){
        System.out.println("Working as an manager");
    }
    
    void addEmployee(){
        System.out.println("Add a new Employee");
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee(25000);
        e1.work();
        double s1 = e1.salary;
        
        System.out.println("Employeer salary "+s1);
        
        HRmanager hr1 = new HRmanager(40000.0);
        hr1.work();
        System.out.println("HR 1 Salary: "+hr1.salary);
        
        hr1.addEmployee();
    }
}
