package Vehicles;

import Parts.InnerParts.Battery;

public class ElectricVehicle extends VehicleBase {
    private Battery battery;

    public ElectricVehicle() {
        super();
        battery = new Battery();
    }

    public Battery getBattery(){
        return this.battery;
    }
}
