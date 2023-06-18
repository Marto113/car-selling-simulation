package Vehicles;

import Helper.Determiner;
import Parts.InnerParts.Engine;

public class CombustionVehicle extends VehicleBase {
    private Engine engine;

    public CombustionVehicle() {
        super();
        engine = new Engine();
    }

<<<<<<< HEAD
    public String getCarType(){
        return "Combustion";
    }
=======
    public Engine getEngine(){
        return this.engine;
    }

>>>>>>> main
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass())
            return false;

        CombustionVehicle other = (CombustionVehicle) obj;

        return 
                this.engine.equals(other.engine) &&
                this.getCarType().equals(other.getCarType()) &&
                this.getModel().equals(other.getModel()) &&
                this.getCondition().equals(other.getCondition()) &&
                this.getType().equals(other.getType());

    }
}
