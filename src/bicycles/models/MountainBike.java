package bicycles.models;

import bicycles.Bicycle;

public class MountainBike implements Bicycle {
    public int speed;
    @Override
    public void accelerate() {
        speed += 5;

    }

    @Override
    public void brake() {
        if(speed>0) {
            speed -= 3;
        }else{
            speed = 0;
        }
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public int currentSpeed() {
        return speed;
    }
}
