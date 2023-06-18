package Vehicles;

import Parts.InnerParts.Engine;

public class CombustionVehicle extends VehicleBase {
    private Engine engine;

    public CombustionVehicle() {
        super();
        engine = new Engine();
    }

    public Engine getEngine(){
        return this.engine;
    }

    
    
}
