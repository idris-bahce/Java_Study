package ChallangeOfInheritence;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startEngine(){
        System.out.println("Car engine is starting");
    }
    public void accelerate(){
        System.out.println("Car is accelerating");
    }
    public void brake(){
        System.out.println("Car is braking");
    }

}
