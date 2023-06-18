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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass())
            return false;

        HybridVehicle other = (HybridVehicle) obj;

        return 
                this.battery.equals(other.battery) &&
                this.engine.equals(other.engine) &&
                this.getCarType().equals(other.getCarType()) &&
                this.getModel().equals(other.getModel()) &&
                this.getCondition().equals(other.getCondition()) &&
                this.getType().equals(other.getType());

    }
}
