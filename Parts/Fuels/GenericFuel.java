package Parts.Fuels;

public abstract class GenericFuel {
    protected float efficiencyStandard;

    GenericFuel() {

    }

    public GenericFuel(int efficiencyStandard)  {
        this.efficiencyStandard = efficiencyStandard;
    }

    protected GenericFuel(Float efficiencyStandard)  {
        this.efficiencyStandard = efficiencyStandard;
    }

    public abstract float getPollution();

    public abstract float getFuelConsumption();

    public abstract FuelEnum getType();
}
