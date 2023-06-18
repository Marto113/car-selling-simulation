package Vehicle.Type;

public class Type {
    private String type;
    private int doors;
    private int luggageCapacity;

    public Type(){
        int[] doorsArray = {2, 4};
        Random random = new Random();
        int indexFromDoorArray = nextInt(doorsArray.lenght());
        this.doors = doorsArray[indexFromDoorArray];

        Random capacity = new Random();
        this.luggageCapacity = capacity.nextInt(50 - 10 + 1) + 10;
        
        getType();
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
        if (this.doors == 2){
            if (this.luggageCapacity < 10){
                this.type = "Coupe";
            } else if (this.luggageCapacity >= 10) {
                this.type = "Truck";
            }
        }

        if (this.doors == 4){
            if (this.luggageCapacity >= 35){
                this.type = "SUV";
            } else if (this.luggageCapacity >= 30){
                this.type = "Combi";
            } else if (this.luggageCapacity >= 20){
                this.type = "Sedan";
            } else if (this.luggageCapacity < 20){
                this.type = "Hatchback";
            } 
        }
        
        return this.type;
    }
}