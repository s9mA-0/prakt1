public class Car {
    private String brand;
    private int year;
    private double engineCapacity;

    public Car(String brand, int year, double engineCapacity) {
        this.brand = brand;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public void displayInfo() {
        System.out.println("Автомобіль: " + brand + ", рік випуску: " + year + ", об'єм двигуна: " + engineCapacity + " л");
    }

    public double calculateTax(int taxRate) {
        return engineCapacity * taxRate;
    }

    public void updateYear(int newYear) {
        this.year = newYear;
    }
}