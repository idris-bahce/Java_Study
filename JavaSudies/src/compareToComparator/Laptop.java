package compareToComparator;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private double ram;
    private double price;

    public Laptop(String brand, double ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop lap) {
        if (this.price > lap.price){
            return 1;
        } else if (this.price == lap.price) {
            return 0;
        }else {
            return -1;
        }
    }
}
