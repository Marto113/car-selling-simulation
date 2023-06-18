package Vehicles.Base;

import Parts.InnerParts.Engine;

public class VehicleBase {
    private String model;
    private Type type;
    private Condition condition;
    private Engine engine;

    public String getModel(){
        return this.model;
    }

    public String getType(){
        return type.getType();
    }

    public String getCondition(){
        return condition.getCondition();
    }

    public int getFuelConsumption(){
        int cylinders = engine.getNumberOfCylinders();
        int cc = engine.getCubicCapacity();
        String fuel = engine.getFuelType();

        int consumption = cylinders * cc;

        if (fuel == "Diesel"){
            consumption /= 2000;
            return consumption;
        } else if (fuel == "Petrol"){
            consumption /= 2200;
            return consumption;
        } else if (fuel == "Gas"){
            consumption /= 3000;
            return consumption;
        }

        return consumption / 2000;
    }
}
