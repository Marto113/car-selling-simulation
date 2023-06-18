package Parts.Fuels;

public class Gas extends GenericFuel{
    Gas() {
        super();
    }

    public Gas(float efficiencyStandard) {
        super(efficiencyStandard);
    }

    @Override
    public float getPollution() {
        return (float)0.8 / this.efficiencyStandard;
    }

    @Override
    public float getFuelConsumption() {
        return (float)1.3 / this.efficiencyStandard;
    }

    @Override
    public FuelEnum getType() {
        return FuelEnum.GAS;
    }
}
