package Object_Oriented_Programming.Abstract_Class;

import java.util.Date;
public abstract class GeometricObject {
    private String color; 
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {}
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date(System.currentTimeMillis());
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
