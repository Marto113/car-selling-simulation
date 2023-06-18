package Dealership;
import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

import Vehicles.CombustionVehicle;
import Vehicles.ElectricVehicle;
import Vehicles.HybridVehicle;
import Vehicles.VehicleBase;

public class DealerShip {
    private HashMap<VehicleBase, Vector<VehicleBase>> availableCars = new HashMap<VehicleBase, Vector<VehicleBase>>();

    public DealerShip() {

    }

    public void print() {
        for (HashMap.Entry<VehicleBase, Vector<VehicleBase>> entry : availableCars.entrySet()) {
            VehicleBase vehicleType = entry.getKey();
            Vector<VehicleBase> vehicles = entry.getValue();

            System.out.println("cat:");
            for (VehicleBase vehicle : vehicles) {
                vehicle.print();
            }
            System.out.println("\n");

        }
    }

    public void makeVehicle() {
        Random random = new Random();

        VehicleBase newVehicle;

        int carType = random.nextInt(3);

        if (carType == 0) {
            newVehicle = new CombustionVehicle();
        } else if (carType == 1) {
            newVehicle = new HybridVehicle();
        } else newVehicle = new ElectricVehicle();

        if (availableCars.containsKey(newVehicle) == false) {
            Vector<VehicleBase> cars = new Vector<VehicleBase>();
            cars.add(newVehicle);
            availableCars.put(newVehicle, cars);
        } else { 
            availableCars.get(newVehicle).add(newVehicle);
        }
    }

    public VehicleBase removeVehicle(VehicleBase Vehicle, int idx) {
        if (availableCars.containsKey(Vehicle)) {
            if (!availableCars.get(Vehicle).isEmpty()) {
                VehicleBase temp = availableCars.get(Vehicle).elementAt(idx);
                availableCars.get(Vehicle).remove(idx);
                return temp;
            } 
        } 

        return null;
    }

}
