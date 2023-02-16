package ChallangeOfInheritence;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi is braking");
    }
}
