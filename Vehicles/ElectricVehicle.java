package Vehicles;

import Parts.InnerParts.Battery;

public class ElectricVehicle extends VehicleBase {
    private Battery battery;

    public ElectricVehicle() {
        super();
        battery = new Battery();
    }

    public String getCarType(){
        return "Electric";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass())
            return false;

        ElectricVehicle other = (ElectricVehicle) obj;

        return 
                this.battery.equals(other.battery) &&
                this.getCarType().equals(other.getCarType()) &&
                this.getModel().equals(other.getModel()) &&
                this.getCondition().equals(other.getCondition()) &&
                this.getType().equals(other.getType());

    }
}
