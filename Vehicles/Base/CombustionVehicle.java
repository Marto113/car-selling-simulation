package Vehicles.Base;

import Parts.InnerParts.Engine;
import Parts.Fuels.*;

public class CombustionVehicle extends VehicleBase {
    private Engine engine;

    public CombustionVehicle() {
        super();
        engine = new Engine();
    }

    
    
}
