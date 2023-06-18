package Vehicles.Base;
import java.util.Random;

public class Condition{
    private String condition;
    private int millage;
    private int yearsSinceProduction;
    private int yearsOfUsage;

    public Condition(){
        Random millageRandom = new Random();
        this.millage = millageRandom.nextInt(250000 - 1000 + 1) + 1000;

        Random yearSPRandom = new Random();
        this.yearsSinceProduction = yearSPRandom.nextInt(20 - 3 + 1) + 3;

        Random yearOURandom = new Random();
        this.yearsOfUsage = yearOURandom.nextInt(25 - 1 + 1) + 1;

        this.condition = getCondition();
    }

    public int getMillage(){
        return this.millage;
    }

    public int getYearsSinceProduction(){
        return this.yearsSinceProduction;
    }

    public int getYearsOfUsage(){
        return this.yearsOfUsage;
    }

    public void setMillage(int m){
        this.millage = m;
    }

    public void setYearsSinceProduction(int yp){
        this.yearsSinceProduction = yp;
    }

    public void setYearsOfUsage(int ys){
        this.yearsOfUsage = ys;
    }

    public String getCondition(){
        if (this.millage < 50000 && this.yearsSinceProduction < 5 && this.yearsOfUsage < 3){
            this.condition = "Excellent";
        } else if (this.millage < 125000 && this.yearsSinceProduction < 10 && this.yearsOfUsage < 7) {
            this.condition = "Good";
        } else if (this.millage < 250000 && this.yearsSinceProduction < 20 && this.yearsOfUsage < 15){
            this.condition = "Bad";
        }else{
            this.condition = "Scrap";
        }

        return this.condition;
    }
}