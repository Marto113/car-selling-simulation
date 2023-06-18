package People;

import java.lang.reflect.Type;
import java.util.concurrent.locks.Condition;

public class Person {
    private String name;
    private double budget;
    private Type type;

    private Condition condition;

    public Person(String name, double budget, Type type, Condition condition) {
        this.name = name;
        this.budget = budget;
        this.type = type;
        this.condition = condition;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void buy(VehicleBase vb) {

    }

    public void makeOffer(double offerPrice) {

    }
}
