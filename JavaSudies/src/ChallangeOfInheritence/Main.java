package ChallangeOfInheritence;

public class Main {
    public static void main(String[] args) {

//        Employee idris = new Employee("Idris","04/04/1996","17/03/2023");
//        System.out.println(idris);
//        System.out.println("Age = " + idris.getAge());
//        System.out.println("Pay = " + idris.collectPay());
//
//        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990","03/03/2010"
//                ,350000);
//        System.out.println(joe);
//        System.out.println("joe's paycheck = " + joe.collectPay() );
//        joe.retire();
//        System.out.println("Joe's Pension check = $ " + joe.collectPay());


        Car car = new Car("2023 Black Lamborgini 3");
        runRace(car);
    }

    private static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
