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

    public void makeVehicle() {
        Random random = new Random();

        VehicleBase newVehicle;

        int carType = random.nextInt(3);

        if (carType == 0) {
            newVehicle = new CombustionVehicle();
        } else if (carType == 1) {
            newVehicle = new HybridVehicle();
        } else newVehicle = new ElectricVehicle();

        if (availableCars.get(newVehicle) == null) {
            Vector<VehicleBase> cars = new Vector<VehicleBase>();
            cars.add(newVehicle);
            availableCars.put(newVehicle, cars);
        } availableCars.get(newVehicle).add(newVehicle);
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
