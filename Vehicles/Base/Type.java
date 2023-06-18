package Vehicles.Base;
import java.util.Random;

public class Type {
    private String type;
    private int doors;
    private int luggageCapacity;

    public Type(){
        int[] doorsArray = {2, 4};
        Random random = new Random();
        int indexFromDoorArray = nextInt(doorsArray.length);
        this.doors = doorsArray[indexFromDoorArray];

        Random capacity = new Random();
        this.luggageCapacity = capacity.nextInt(50 - 10 + 1) + 10;
        
        this.type = getType();
    }

    public int getDoors(){
        return this.doors;
    }

    public void setDoors(int d){
        this.doors = d;
    }

    public int getLuggageCapacity(){
        return this.luggageCapacity; 
    }

    public void get_luggageCapacity(int lc){
        this.luggageCapacity = lc; 
    }

    public String getType(){
        String temp;

        if (this.doors == 2){
            if (this.luggageCapacity < 10){
                temp = "Coupe";
            } else if (this.luggageCapacity >= 10) {
                temp = "Truck";
            }
        }

        if (this.doors == 4){
            if (this.luggageCapacity >= 35){
                temp = "SUV";
            } else if (this.luggageCapacity >= 30){
                temp = "Combi";
            } else if (this.luggageCapacity >= 20){
                temp = "Sedan";
            } else if (this.luggageCapacity < 20){
                temp = "Hatchback";
            } 
        }

        this.type = temp;
        
        return this.type;
    }
}