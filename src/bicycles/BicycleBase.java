package bicycles;

public abstract class BicycleBase implements Bicycle {

    public int speed;

    public void changeSpeed(int x) {
        this.speed += x;

    }

    public void stop() {
        speed = 0;
    }

    public int currentSpeed() {

        if (speed > 0) {
            return speed;

        } else {
            return 0;
        }

    }
}