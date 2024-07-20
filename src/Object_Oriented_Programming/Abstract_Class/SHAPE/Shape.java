package Object_Oriented_Programming.Abstract_Class.SHAPE;

public abstract class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape() {}
    public Shape(String color, boolean filled) { 
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { 
        return this.color;
    }
    public void setColor(String color) { 
        this.color = color;
    }

    public boolean isFilled() { 
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter(); 
}
