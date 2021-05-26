package bicycles;
public class BicycleSpecification{

    public int accelerationSpeed;
    public int brakeSpeed;
    public  BicycleType bicycleType;

    public BicycleSpecification(int accelerationSpeed,int brakeSpeed,BicycleType bicycleType){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public  int  getAccelerationSpeed(){
        return accelerationSpeed;

    }
    public int getBrakeSpeed(){
        return brakeSpeed;
    }
    public BicycleType getBicycleType(){
        return bicycleType;

    }
}


