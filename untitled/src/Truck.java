public class Truck {
    private String brand;
    private int year;
    private double payloadCapacity;

    public Truck(String brand, int year, double payloadCapacity) {
        this.brand = brand;
        this.year = year;
        this.payloadCapacity = payloadCapacity;
    }

    // Void-метод
    public void printInfo() {
        System.out.println("Вантажівка: " + brand + ", рік випуску: " + year + ", вантажопідйомність: " + payloadCapacity + " т");
    }

    // Типізований метод
    public double calculateFuelConsumption(int fuelRate) {
        return payloadCapacity * fuelRate;
    }

    // Метод з параметрами
    public void updatePayloadCapacity(double newPayloadCapacity) {
        this.payloadCapacity = newPayloadCapacity;
    }
}