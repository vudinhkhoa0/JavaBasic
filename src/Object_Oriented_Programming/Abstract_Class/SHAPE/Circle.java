package Object_Oriented_Programming.Abstract_Class.SHAPE;

import java.lang.Math;
public class Circle extends Shape{
    protected double radius; 

    public Circle(double radius, String color, boolean filled) { 
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() { 
        return Math.PI * this.radius * this.radius;
    }
    @Override 
    public double getPerimeter() { 
        return Math.PI * this.radius * 2;
    }

    public String toString() { 
        return  "--\n" + "Radius : " + String.format("%.2f", this.radius)
                + "\nColor : " + this.color + "\nfilled : " + this.filled + "\nPerimeter : " 
                + String.format("%.2f", this.getPerimeter()) + "\nArea : " 
                + String.format("%.2f", this.getArea()) + "\n";
    }
}
