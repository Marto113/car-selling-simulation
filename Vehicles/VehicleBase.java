package Vehicles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Helper.Determiner;

public abstract class VehicleBase {
    private String model;
    private Type type;
    private Condition condition;
    private int price;

    public VehicleBase(){
        this.model = getRandomModel();
        this.type = new Type();
        this.condition = new Condition();
        this.price = setPrice();
    }

    public int setPrice(){
        int temp = 0;

        String condition = this.condition.getCondition();

        if (condition.equals("Scrap")) {
            temp = 5000;
        } else if (condition.equals("Bad")) {
            temp = 10000;
        } else if (condition.equals("Good")) {
            temp = 25000;
        } else if (condition.equals("Excellent")) {
            temp = 50000;
        }

        return temp;
    }

    public String getRandomModel(){
        String filePath = "Vehicles/cars.txt";
        List<String> vehicleModels = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                vehicleModels.add(line);
            }
            
            if (!vehicleModels.isEmpty()) {
                Random random = new Random();
                int randomIndex = random.nextInt(vehicleModels.size());
                model = vehicleModels.get(randomIndex);
            } else {
                System.out.println("No vehicle models found in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }

    public String getModel(){
        return this.model;
    }

    public String getType(){
        return type.getType();
    }

    public String getCarType(){
        return "";
    }

    public String getCondition(){
        return condition.getCondition();
    }

    public void print(){
        System.out.print(getCarType() + " ");
        System.out.print(getModel() + " ");
        System.out.print(getType() + " ");
        System.out.println(getCondition());
    }

    @Override
    public int hashCode() {
        int hash = 0;

        hash += Determiner.determineCondition(this.getCondition()) * 10;

        hash += Determiner.determineType(getType()) * 100;

        //System.out.println(hash);
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        VehicleBase other = (VehicleBase) obj;

        return 
               this.getCarType().equals(other.getCarType()) &&
               this.getModel().equals(other.getModel()) &&
               this.getCondition().equals(other.getCondition()) &&
               this.getType().equals(other.getType());

    }
}
