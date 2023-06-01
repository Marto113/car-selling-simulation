public class Car {
    public String model;
    public String brand;
    public String category;
    public String millage;

    public Car(String m, String b, String c, String m){
        this.model = m;
        this.brand = b;
        this.category = c;
        this.millage = m; 
    }

    public String getModel(){
        return this.model;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getCategory(){
        return this.category;
    }

    public String getMillage(){
        return this.millage;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setMillage(String millage){
        this.millage = millage;
    }
}
