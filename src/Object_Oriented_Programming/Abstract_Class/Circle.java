package Object_Oriented_Programming.Abstract_Class;

import java.lang.Math;
public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    @Override
    public double getArea() { 
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public double getPerimeter() { 
        return 2 * Math.PI * this.radius;
    }
}
