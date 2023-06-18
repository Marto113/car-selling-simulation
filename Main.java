import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

import Vehicles.*;
import People.*;

public class Main {
    public static void main(String[] args) throws Exception {
        HashMap<VehicleBase, Integer> availableCars = new HashMap<VehicleBase, Integer>();

        Random random = new Random();

        while(true) {
            VehicleBase newVehicle;

            int carType = random.nextInt(3);

            if (carType == 0) {
                newVehicle = new CombustionVehicle();
            } else if (carType == 1) {
                newVehicle = new HybridVehicle();
            } else newVehicle = new ElectricVehicle();

            if (availableCars.get(newVehicle) != null) {
                availableCars.put(newVehicle, availableCars.get(newVehicle) + 1);
            } availableCars.put(newVehicle, 1);
            
            
        }



    }
}
