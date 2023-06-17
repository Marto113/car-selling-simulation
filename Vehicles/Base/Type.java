package Vehicle.Type;

public class Type {
    private String type;
    private int doors;
    private int luggageCapacity;

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
        if (this.doors == 2){
            if (this.luggageCapacity < 10){
                this.type = "Coupe";
            } else if (this.luggageCapacity >= 10) {
                this.type = "Truck";
            }
        }

        if (this.doors == 4){
            if (this.luggageCapacity >= 20){
                this.type = "Sedan";
            } else if (this.luggageCapacity < 20){
                this.type = "Hatchback";
            } else if (this.luggageCapacity >= 35){
                this.type = "SUV";
            }
        }
        
        return this.type;
    }
}