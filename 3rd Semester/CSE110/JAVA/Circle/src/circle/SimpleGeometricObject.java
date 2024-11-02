package circle;

public class SimpleGeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;
    
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    public SimpleGeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        String str = "Created on "+dateCreated+"\nColor: "+color+"\nFilled: "+filled;
        return str;
    }
    
}
