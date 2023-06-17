package Vehicle.Condition;

public class Condition{
    private String condition;
    private int millage;
    private int yearsSinceProduction;
    private int yearsOfUsage;

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
        if (this.millage < 250000 && this.yearsSinceProduction < 20 && this.yearsOfUsage < 15){
            this.condition = "Bad";
        } else if (this.millage < 125000 && this.yearsSinceProduction < 10 && this.yearsOfUsage < 7) {
            this.condition = "Good";
        } else if (this.millage < 50000 && this.yearsSinceProduction < 5 && this.yearsOfUsage < 3){
            this.condition = "Excellent";
        }

        return this.condition;
    }
}