package Object_Oriented_Programming.Interface.multiple;

public class Bird implements Flyable, Runable {
    @Override 
    public void fly() { 
        System.out.println("Bird can fly");
    }
    @Override 
    public void run() { 
        System.out.println("Bird can run");
    }
}
