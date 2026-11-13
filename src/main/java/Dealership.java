import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public List<Vehicle> getVehicles(float min, float max) {
        List<Vehicle> result;
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> result;
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        List<Vehicle> result;
        return null;
    }

    public List<Vehicle> getVehiclesColor(String color) {
        List<Vehicle> result;
        return null;
    }

    public List<Vehicle> getVehiclesByMilage(int min, int max) {
        List<Vehicle> result;
        return null;
    }

    public List<Vehicle> getAllVehicles() { return inventory; }

    public void addVehicle(Vehicle vehicle) { inventory.add(vehicle); }
}
