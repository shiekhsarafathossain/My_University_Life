package newpackage2;

abstract public class Patient {
    int id;
    String name;
    
    Patient(){
        
    }
    
    Patient(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "ID: "+id+"\nName: "+name;
    }
    
    abstract double bill();
    
    
}
