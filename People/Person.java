package People;

import Dealership.DealerShip;
import Helper.Determiner;
import Vehicles.Condition;
import Vehicles.Type;
import Vehicles.VehicleBase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Person {
    private String name;
    private double budget;
    private Type preferredType;

    private String preferredCondition;

    public Person() {
        this.name = generateName();
        this.budget = generateBudget();
        this.preferredType = new Type();
        this.preferredCondition = generatePreferredCondition();
    }


    private String generatePreferredCondition() {
        if(budget > 50000){
            return "Excellent";
        }else if(budget > 25000){
            return "Good";
        }else if(budget > 10000){
            return "Bad";
        }else if(budget > 5000){
            return "Scrap";
        }else{
            System.out.println("The budget is not enough");
            return null;
        }
    }


    public String generateName(){
        String filePath = "People/people.txt";
        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }

            if (!names.isEmpty()) {
                Random random = new Random();
                int randomIndex = random.nextInt(names.size());
                name = names.get(randomIndex);
            } else {
                System.out.println("No vehicle models found in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }

    public int generateBudget(){
        int MIN_BUDGET = 5000;
        int MAX_BUDGET = 55000;
        Random random = new Random();
        return random.nextInt(MAX_BUDGET - MIN_BUDGET + 1) + MIN_BUDGET;
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

    public String getPreferredType() {
        return preferredType.getType();
    }

    public void setPreferredType(Type preferedType) {
        this.preferredType = preferedType;
    }

    public String getPreferredCondition() {
        return preferredCondition;
    }

    public void setCondition(Condition prefferredCondition) {
        this.preferredCondition = preferredCondition;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        hash += Determiner.determineCondition(this.getPreferredCondition()) * 10;

        hash += Determiner.determineType(getPreferredType()) * 100;

        return hash;
    }

    public VehicleBase buy(DealerShip store) {
        return store.removeVehicle(store.getAvailableCars().get(hashCode()).get(0));
    }

}
