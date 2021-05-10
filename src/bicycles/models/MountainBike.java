package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {

    @Override
    public void accelerate() {

        changeSpeed(5) ;

    }

    @Override
    public void brake() {
        changeSpeed(-3);

    }


}
