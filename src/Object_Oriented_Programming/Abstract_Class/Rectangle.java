package Object_Oriented_Programming.Abstract_Class;

public class Rectangle extends GeometricObject {
    private double width, height;
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }
    @Override 
    public double getArea() { 
        return this.height * this.width;
    }
    @Override 
    public double getPerimeter() { 
        return (this.height + this.width) * 2;
    }
}
