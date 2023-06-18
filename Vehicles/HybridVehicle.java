package Vehicles;

import Parts.InnerParts.Battery;
import Parts.InnerParts.Engine;

public class HybridVehicle extends VehicleBase {
    private Battery battery;
    private Engine engine;
    
    public HybridVehicle() {
        super();
        engine = new Engine();
        battery = new Battery();
    }

    public String getCarType(){
        return "Hybrid";
    }

}
