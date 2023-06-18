package Vehicles;

import Parts.InnerParts.Battery;
import Parts.InnerParts.Engine;

public class HybridVehicle extends VehicleBase {
    private Battery battery;
    private Engine engine;
    
    HybridVehicle() {
        super();
        engine = new Engine();
        battery = new Battery();
    }

    

}
