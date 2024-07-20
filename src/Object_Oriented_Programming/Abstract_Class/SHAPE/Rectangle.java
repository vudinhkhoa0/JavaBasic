package Object_Oriented_Programming.Abstract_Class.SHAPE;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle(String color, boolean filled, double width, double length) { 
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override 
    public double getArea() {
        return this.width * this.length;
    }
    @Override 
    public double getPerimeter() { 
        return 2 * (this.width + this.length);
    }

    public String toString() { 
        return "Width : " + String.format("%.2f", this.width) + "\nLength : " 
        + String.format("%.2f", this.length) + "\nColor : " + this.color + "\nFilled : " + this.filled 
        + "\nPerimeter : " + String.format("%.2f", this.getPerimeter())
        + "\nArea : " + String.format("%.2f", this.getArea()) + "\n";
    }
}
