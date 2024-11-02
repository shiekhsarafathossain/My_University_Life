package mypackage;

public class Faculty {
    private int fid;
    private String fname;
    private String fpos;
    
    public Faculty(){
        
    }
    
    public Faculty(int fid, String fname, String fpos){
        this.fid = fid;
        this.fname = fname;
        this.fpos = fpos;
    }
    
    public int getFid(){
        return fid;
    }
    
    public String getFname(){
        return fname;
    }
    
    public String getFpos(){
        return fpos;
    }
    
    public void setFid(int fid){
        this.fid = fid;
    }
    
    public void setFname(String fname){
        this.fname = fname;
    }
    
    public void setFpos(String fpos){
        this.fpos = fpos;
    }
    
    @Override
    public String toString(){
        return fid + ", " + fname + ", " + fpos;
    }
    
    
}
