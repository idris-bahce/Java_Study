package ChallangeOfInheritence;

public class Ford  extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Ford is braking");
    }
}
