package People;

import Vehicles.Condition;
import Vehicles.Type;
import Vehicles.VehicleBase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    private String name;
    private double budget;
    private Type preferredType;

    private Condition preferredCondition;

    public Person() {
        this.name = GenerateName();
        this.budget = GenerateBudget();
        this.preferredType = new Type();
        this.preferredCondition = new Condition();
    }

    public String GenerateName(){
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

    public int GenerateBudget(){
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
        return preferredCondition.getCondition();
    }

    public void setCondition(Condition prefferredCondition) {
        this.preferredCondition = preferredCondition;
    }

    public void buy(VehicleBase vb) {

    }

}
