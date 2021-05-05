package bicycles.models;

import bicycles.Bicycle;

public class RoadBike implements Bicycle {

    public int speed;
    @Override
    public void accelerate() {
            speed += 11;

    }

    @Override
    public void brake() {

            if (speed > 0) {
                speed -= 4;

            } else {
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
