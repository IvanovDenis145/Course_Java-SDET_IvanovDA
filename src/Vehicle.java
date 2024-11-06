public abstract class Vehicle {
    private String brand;
    private String model;
    private static int vehicleCount = 0;
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        vehicleCount++;
    }
    public void displayInfo() {
        System.out.println("Бренд : " + brand + " Модель : " + model);
    }
    public static int getVehicleCount() {
        return vehicleCount;
    }
    public abstract void Readiness();
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
}
