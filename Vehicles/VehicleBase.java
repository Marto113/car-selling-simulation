package Vehicles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleBase {
    private String model;
    private Type type;
    private Condition condition;

    public VehicleBase(){
        this.model = getRandomModel();
        this.type = new Type();
        this.condition = new Condition();
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

    public String getCondition(){
        return condition.getCondition();
    }
}
