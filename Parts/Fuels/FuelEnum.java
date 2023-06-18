package Parts.Fuels;

public enum FuelEnum {
    DIESEL("Diesel"),
    GAS("Gas"),
    PETROl("Petrol");

    private String name;

    public final String getName() {
        return name;
    }

    private FuelEnum(String name) {
        this.name = name;
    }
}
