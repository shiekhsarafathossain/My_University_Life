package Lab6;

class Faculty {
    int facultyId;
    String facultyName;
    String facultyPosition;
    
    Faculty(){
        
    }
    
    Faculty(int facultyId, String facultyName, String facultyPosition){
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }
    
    
    
    void display(){
        System.out.println(facultyId+"\n"+facultyName+"\n"+facultyPosition+"\n");
    }
}
