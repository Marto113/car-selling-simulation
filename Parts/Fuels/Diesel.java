package Parts.Fuels;

public class Diesel extends GenericFuel{
    Diesel() {
        super();
    }

    public Diesel(float efficiencyStandard) {
        super(efficiencyStandard);
    }

    @Override
    public float getPollution() {
        return (float)1.5 / this.efficiencyStandard;
    }

    @Override
    public float getFuelConsumption() {
        return (float)0.7 / this.efficiencyStandard;
    }

    @Override
    public FuelEnum getType() {
        return FuelEnum.DIESEL;
    }
}
