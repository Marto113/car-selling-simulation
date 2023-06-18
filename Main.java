import Vehicles.Base.VehicleBase;

public class Main {
    public static void main(String[] args) throws Exception {
        VehicleBase vb = new VehicleBase();

        System.out.println(vb.getModel());
        System.out.println(vb.getType());
        System.out.println(vb.getCondition());

    }
}
