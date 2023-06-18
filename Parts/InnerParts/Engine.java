package Parts.InnerParts;
import java.util.Random;

import Parts.Fuels.*;

public class Engine {
    private int numberOfCylinders;
    private int cubicCapacity;
    private GenericFuel fuel;

    public Engine(){
        Random randFuel = new Random();
        int indexFromTypes = randFuel.nextInt(3);
        float randomFuelEfficiency = randFuel.nextFloat((float)(0.2)) + (float)0.8;
        setFuelType(FuelEnum.values()[indexFromTypes] , randomFuelEfficiency);

        int[] cylinders = {1, 2, 4, 6, 8, 10};
        Random cylinder = new Random();
        int indexFromCylinder = cylinder.nextInt(cylinders.length);

        Random cc = new Random();
        int num = 0;
        this.numberOfCylinders = cylinders[indexFromCylinder];

        switch(numberOfCylinders) {
            case 1:
                num = cc.nextInt(1000 - 600 + 1) + 600;
                break;
            case 2:
                num = cc.nextInt(1400 - 1000 + 1) + 1000;
                break;
            case 4:
                num = cc.nextInt(2000 - 1500 + 1) + 1500;
                break;
            case 6:
                num = cc.nextInt(3700 - 3000 + 1) + 3000;
                break;
            case 8:
                num = cc.nextInt(6100 - 3900 + 1) + 3900;
                break;
            case 10:
                num = cc.nextInt(8400 - 5200 + 1) + 5200;
                break;
        }

        this.cubicCapacity = num;
    }

    public int getNumberOfCylinders(){
        return this.numberOfCylinders;
    }

    public int getCubicCapacity(){
        return this.cubicCapacity;
    }

    public String getFuelType(){
        return this.fuel.getType().getName();
    }

    public void setNumberOfCylinders(int c){
        this.numberOfCylinders = c;
    }

    public void setCubicCapacity(int cc){
        this.cubicCapacity = cc;
    }

    public void setFuelType(FuelEnum fuel, float efficiency) {
        switch (fuel.getName()) {
            case "Diesel":
                this.fuel = new Diesel(efficiency);
                break;
            case "Gas":
                this.fuel = new Gas(efficiency);
                break;
            case "Petrol":
                this.fuel = new Petrol(efficiency);
                break;
        }
    }

    public int getFuelConsumption(){
        return (int)((this.numberOfCylinders * this.cubicCapacity) * fuel.getFuelConsumption());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        Engine other = (Engine) obj;

        return 
                this.getFuelType().equals(other.getFuelType()) &&
                this.cubicCapacity == other.cubicCapacity &&
                this.numberOfCylinders == other.numberOfCylinders;

    }
}
