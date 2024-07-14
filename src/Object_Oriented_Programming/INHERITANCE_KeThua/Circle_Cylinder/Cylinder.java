package Object_Oriented_Programming.INHERITANCE_KeThua.Circle_Cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * this.height;
    }
    public String toString() {
        return "Color : " + super.getColor() + "\nHeight : " + 
        String.format("%.2f", this.height) + "\nRadius : " + String.format("%.2f", super.getRadius()) + "\nVolume : " + 
        String.format("%.2f", this.getVolume()) + "\n----------\n";
    }
}
