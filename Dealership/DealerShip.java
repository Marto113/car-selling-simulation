package Dealership;
import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

import Vehicles.CombustionVehicle;
import Vehicles.ElectricVehicle;
import Vehicles.HybridVehicle;
import Vehicles.VehicleBase;

public class DealerShip {
    private HashMap<Integer, Vector<VehicleBase>> availableCars = new HashMap<Integer, Vector<VehicleBase>>();

    public DealerShip() {

    }

    public void print() {
        for (HashMap.Entry<Integer, Vector<VehicleBase>> entry : availableCars.entrySet()) {
            //System.out.println(entry.getValue().size());

            System.out.println(entry.getKey());
            for (VehicleBase i : entry.getValue()) {
                i.print();
            }

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

        if (availableCars.containsKey(newVehicle.hashCode()) == false) {
            Vector<VehicleBase> cars = new Vector<VehicleBase>();
            cars.add(newVehicle);
            availableCars.put(newVehicle.hashCode(), cars);
        } else { 
            availableCars.get(newVehicle.hashCode()).add(newVehicle);
        }
    }

    public VehicleBase removeVehicle(VehicleBase Vehicle, int idx) {
        if (availableCars.containsKey(Vehicle.hashCode())) {
            if (!availableCars.get(Vehicle.hashCode()).isEmpty()) {
                VehicleBase temp = availableCars.get(Vehicle.hashCode()).elementAt(idx);
                availableCars.get(Vehicle.hashCode()).remove(idx);
                return temp;
            } 
        } 

        return null;
    }

}
