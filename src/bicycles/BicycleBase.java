package bicycles;

public abstract class BicycleBase implements Bicycle {

    private int speed;

    protected int changeSpeed(int x) {
        this.speed += x;
        return speed;

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