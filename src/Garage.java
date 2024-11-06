import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {
    private List<T> vehicles;
    public Garage(){
        vehicles = new ArrayList<T>();
    }
    public void addVehicle(T vehicle){
        vehicles.add(vehicle);
    }

    public void displayAllVehicles(){
        for(T vehicle : vehicles){
            vehicle.displayInfo();
            vehicle.Readiness();
        }
    }
}
