package bicycles;

public class BicycleFromSpec extends BicycleBase{

    private BicycleSpecification bicycleSpec;

    public  BicycleFromSpec(BicycleSpecification bicycleSpec){
        //getBicycleSpecification
        this.bicycleSpec = bicycleSpec;

    }
    @Override
    public void accelerate() {
        //this.bicycleSpec to avoid returning null
        this.changeSpeed(this.bicycleSpec.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        this.changeSpeed(this.bicycleSpec.getBrakeSpeed());

    }

    @Override
    public BicycleType getBicycleType() {
        return this.bicycleSpec.getBicycleType();
    }

}
