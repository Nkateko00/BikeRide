package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class RoadBike extends BicycleBase {


    @Override
    public void accelerate() {
        changeSpeed(11);

    }

    @Override
    public void brake() {
        changeSpeed(-4);
    }

    @Override
    public BicycleType getBicycleType() {
        //enums
        return BicycleType.RoadBike;
    }

    //    @Override

}
//    @Override

