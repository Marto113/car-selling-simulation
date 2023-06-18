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
}
