//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 4);
        car.displayInfo();
        car.displayDoors();
        car.chargedBattery();
        car.Readiness();

        Bus bus = new Bus("Ford", "Transit", 20);
        bus.displayInfo();
        bus.displaySeats();
        bus.fullTank();
        bus.Readiness();
    }
}