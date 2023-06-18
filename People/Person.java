package People;

import Vehicles.Base.Condition;
import Vehicles.Base.Type;
import Vehicles.Base.VehicleBase;

public class Person {
    private String name;
    private double budget;
    private Type preferredType;

    private Condition preferredCondition;

    public Person(String name, double budget, Type preferredType, Condition preferredCondition) {
        this.name = name;
        this.budget = budget;
        this.preferredType = preferredType;
        this.preferredCondition = preferredCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Type getPreferredType() {
        return preferredType;
    }

    public void setPreferredType(Type preferedType) {
        this.preferredType = preferedType;
    }

    public Condition getPreferredCondition() {
        return preferredCondition;
    }

    public void setCondition(Condition prefferredCondition) {
        this.preferredCondition = preferredCondition;
    }

    public void buy(VehicleBase vb) {

    }

}
