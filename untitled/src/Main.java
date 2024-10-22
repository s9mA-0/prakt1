public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2015, 2.5);
        Truck truck = new Truck("MAN", 2010, 10.0);
        Motorcycle motorcycle = new Motorcycle("Honda", 2018, 1.2);

        car.displayInfo();
        System.out.println("Податок: " + car.calculateTax(100));
        car.updateYear(2020);
        car.displayInfo();

        truck.printInfo();
        System.out.println("Витрата палива: " + truck.calculateFuelConsumption(5));
        truck.updatePayloadCapacity(15.0);
        truck.printInfo();

        motorcycle.showInfo();
        System.out.println("Страхування: " + motorcycle.calculateInsurance(50));
        motorcycle.updateEngineCapacity(1.5);
        motorcycle.showInfo();
    }
}