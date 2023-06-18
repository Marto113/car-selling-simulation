package Vehicles.Base;

import Parts.InnerParts.Battery;

public class ElectricVehicle {
    private Battery battery;

    public ElectricVehicle() {
        super();
        battery = new Battery();
    }
}
