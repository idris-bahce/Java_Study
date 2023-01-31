package Udemy;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }

    public double getArea() {
        return length * width;
    }
}
