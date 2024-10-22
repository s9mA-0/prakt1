public class Motorcycle {
    private String brand;
    private int year;
    private double engineCapacity;

    public Motorcycle(String brand, int year, double engineCapacity) {
        this.brand = brand;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    // void metod
    public void showInfo() {
        System.out.println("Мотоцикл: " + brand + ", рік випуску: " + year + ", об'єм двигуна: " + engineCapacity + " л");
    }

    // Типізований метод
    public double calculateInsurance(int insuranceRate) {
        return engineCapacity * insuranceRate;
    }
    // Метод з параметрами
    public void updateEngineCapacity(double newEngineCapacity) {
        this.engineCapacity = newEngineCapacity;
    }
}