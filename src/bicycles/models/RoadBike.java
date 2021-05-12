package bicycles.models;

import bicycles.BicycleBase;

public class RoadBike extends BicycleBase {


    @Override
    public void accelerate() {
        changeSpeed(11);

    }

    @Override
    public void brake() {
        changeSpeed(-4);
    }

//    @Override
    public int currentSpeed1() {
        return currentSpeed();
    }
}
//    @Override

