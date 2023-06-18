package Parts.Fuels;

public class Petrol extends GenericFuel{
    Petrol() {
        super();
    }

    public Petrol(float efficiencyStandard) {
        super(efficiencyStandard);
    }

    @Override
    public float getPollution() {
        return 1 / this.efficiencyStandard;
    }

    @Override
    public float getFuelConsumption() {
        return 1 / this.efficiencyStandard;
    }

    @Override
    public FuelEnum getType() {
        return FuelEnum.PETROl;
    }
}
