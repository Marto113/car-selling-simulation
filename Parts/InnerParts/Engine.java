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
}
