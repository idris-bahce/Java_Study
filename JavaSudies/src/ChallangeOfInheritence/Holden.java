package ChallangeOfInheritence;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Holden is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Holden is braking");
    }

}
