package bicycles;

public class BicycleFromSpec extends BicycleBase{

    private BicycleSpecification bicycleSpec;

    public void BicycleFromSpec(BicycleSpecification bicycleSpec){
        this.bicycleSpec = bicycleSpec;

    }
    @Override
    public void accelerate() {
        this.changeSpeed(bicycleSpec.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        this.changeSpeed(bicycleSpec.getBrakeSpeed());

    }
    @Override
    public void getBicycleType() {
        return this.bicycleSpec.getBicycleType();
    }
}
