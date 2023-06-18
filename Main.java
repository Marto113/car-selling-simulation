import java.util.Vector;

import Vehicles.*;
import People.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Vector<VehicleBase> cars = new Vector<VehicleBase>();

        for (int i = 0; i < 10; i++) {
            cars.add(new VehicleBase());
            cars.add(new ElectricVehicle());
            cars.add(new HybridVehicle());
        }

        for (VehicleBase i : cars) {
            System.out.print(i.getModel() + " ");
            System.out.print(i.getType() + " ");
            System.out.println(i.getCondition());
        }
    }
}
