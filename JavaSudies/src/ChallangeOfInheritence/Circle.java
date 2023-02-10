package ChallangeOfInheritence;

public class Circle {
    private double radius;

    public Circle(double radius) {
        radius = radius < 0 ? 0 : radius;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
