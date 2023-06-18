package Parts.InnerParts;
import java.util.Random;

public class Battery {
    public int batteryCapacity;
    public int range;
    public int chargingSpeed;
    public int batteryEfficiency;

    public Battery(){
        Random capacityRandom = new Random();
        this.batteryCapacity = capacityRandom.nextInt(100 - 20 + 1) + 20;

        Random rangeRandom = new Random();
        this.range = rangeRandom.nextInt(640 - 240 + 1) + 240;

        Random chargingRandom = new Random();
        this.chargingSpeed = chargingRandom.nextInt(350 - 50 + 1) + 50;

        Random efficiencyRandom = new Random();
        this.batteryEfficiency = efficiencyRandom.nextInt(5);
    }

    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }

    public int getRange(){
        return this.range;
    }

    public int getChargingSpeed(){
        return this.chargingSpeed;
    }

    public int getBatteryEfficient(){
        return this.batteryEfficiency;
    }

    public String getOverallEfficiency(){
        String temp;
        if (this.batteryCapacity >= 80 && this.range >= 500 && this.chargingSpeed >= 250 && this.batteryEfficiency > 4){
            temp = "Excellent";
        } else if (this.batteryCapacity >= 60 && this.range >= 350 && this.chargingSpeed >= 125 && this.batteryEfficiency >= 3){
            temp = "Good";
        } else if (this.batteryCapacity >= 40 && this.range >= 150 && this.chargingSpeed >= 75 && this.batteryEfficiency >= 2){
            temp = "Bad";
        }else{
            temp = "Scrap";
        }

        return temp;
    }
}
