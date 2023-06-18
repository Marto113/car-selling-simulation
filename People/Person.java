package People;

import Vehicles.Condition;
import Vehicles.Type;
import Vehicles.VehicleBase;

public class Person {
    private String name;
    private double budget;
    private Type preferredType;

    private Condition preferredCondition;

    public Person() {
        this.name = GenerateName();
        this.budget = GenerateBudget();
        this.preferredType = GeneratePreferredType();
        this.preferredCondition = GeneratePreferredCondition();
    }

    public String GenerateName(){
        
    }

    public int GenerateBudget(){

    }

    public Type GeneratePreferredType(){

    }

    public Condition GeneratePreferredCondition(){

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
