package Parts.InnerParts;

public class Engine {
    private int numberOfCylinders;
    private int cubicCapacity;
    private String fuelType;

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
        int cylinders = engine.getNumberOfCylinders();
        int cc = engine.getCubicCapacity();
        String fuel = engine.getFuelType();

        int consumption = cylinders * cc;

        if (fuel == "Diesel"){
            consumption /= 2000;
            return consumption;
        } else if (fuel == "Petrol"){
            consumption /= 2200;
            return consumption;
        } else if (fuel == "Gas"){
            consumption /= 3000;
            return consumption;
        }

        return consumption / 2000;
    }
}
