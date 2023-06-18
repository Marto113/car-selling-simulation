package Parts.InnerParts;
import java.util.Random;

public class Engine {
    private int numberOfCylinders;
    private int cubicCapacity;
    private String fuelType;

    public Engine(){
        int[] cylinders = {1, 2, 4, 6, 8, 10};
        Random cylinder = new Random();
        int indexFromCylinder = cylinder.nextInt(cylinders.length);

        String[] fuelTypes = {"Diesel", "Petrol", "Gas"};
        Random fuel = new Random();
        int indexFromTypes = fuel.nextInt(fuelTypes.length);

        Random cc = new Random();
        int num = 0;
        this.numberOfCylinders = cylinders[indexFromCylinder];

        if(numberOfCylinders == 1){
            num = cc.nextInt(1000 - 600 + 1) + 600;
        } else if (numberOfCylinders == 2){
            num = cc.nextInt(1400 - 1000 + 1) + 1000;
        } else if (numberOfCylinders == 4){
            num = cc.nextInt(2000 - 1500 + 1) + 1500;
        } else if (numberOfCylinders == 6){
            num = cc.nextInt(3700 - 3000 + 1) + 3000;
        } else if (numberOfCylinders == 8){
            num = cc.nextInt(6100 - 3900 + 1) + 3900;
        } else if (numberOfCylinders == 10){
            num = cc.nextInt(8400 - 5200 + 1) + 5200;
        }

        this.cubicCapacity = num;
        this.fuelType = fuelTypes[indexFromTypes];
    }

    public int getNumberOfCylinders(){
        return this.numberOfCylinders;
    }

    public int getCubicCapacity(){
        return this.cubicCapacity;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public void setNumberOfCylinders(int c){
        this.numberOfCylinders = c;
    }

    public void setCubicCapacity(int cc){
        this.cubicCapacity = cc;
    }

    public void setFuelType(String fuel){
        this.fuelType = fuel;
    }

    public int getFuelConsumption(){
        int consumption = this.numberOfCylinders * this.cubicCapacity;

        if (this.fuelType == "Diesel"){
            consumption /= 2000;
            return consumption;
        } else if (this.fuelType == "Petrol"){
            consumption /= 2200;
            return consumption;
        } else if (this.fuelType == "Gas"){
            consumption /= 3000;
            return consumption;
        }

        return consumption / 2000;
    }
}
