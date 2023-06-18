package Vehicles;

import Parts.InnerParts.Battery;
import Parts.InnerParts.Engine;

public class HybridVehicle extends VehicleBase {
    private Battery battery;
    private Engine engine;
    
    public HybridVehicle() {
        super();
        this.engine = new Engine();
        this.battery = new Battery();
    }

    public Battery getBattery(){
        return this.battery;
    }

    public Engine getEngine(){
        return this.engine;
    }
}
