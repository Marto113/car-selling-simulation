package People;

import Vehicles.Base.VehicleBase;

public class Person {
    private String name;
    private double budget;
    private VehicleBase preference;

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

    public VehicleBase getPreference() {
        return preference;
    }

    public void setPreference(VehicleBase preference) {
        this.preference = preference;
    }

    public void buy(VehicleBase vb) {

    }

    public void makeOffer(double offerPrice) {

    }
}
