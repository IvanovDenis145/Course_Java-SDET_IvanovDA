public class Car extends Vehicle implements Electric, Service<Car>{
    private int doors;
    private boolean allEnergy;
    public Car(String brand, String model, int doors) {
        super(brand, model);
        this.doors = doors;
        this.allEnergy = false;
    }

    @Override
    public void chargedBattery() {
        allEnergy = true;
        System.out.println("Батарея автомобиля полностью заряжена");
    }

    @Override
    public void Readiness() {
        if(allEnergy){
            System.out.println("Автомобиль готов к работе");
        }
        else{
            System.out.println("Автомобиль не готов к работе");
        }
    }
    public void displayDoors() {
        System.out.println("Число дверей : " + doors);
    }

    @Override
    public void service(Car vehicle) {
        System.out.println("Обслуживание автомобиля: " + vehicle.getBrand() + " " + vehicle.getModel());
    }
}
