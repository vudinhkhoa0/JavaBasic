package Object_Oriented_Programming.Abstract_Class.SHAPE;

public class Square extends Rectangle{
    public Square (String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
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
        return "Side : " + String.format("%.2f", this.width) 
        + "\nColor : " + this.color + "\nFilled : " + this.filled 
        + "\nPerimeter : " + String.format("%.2f", this.getPerimeter())
        + "\nArea : " + String.format("%.2f", this.getArea()) + "\n";
    }
}
