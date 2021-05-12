package bicycles;

import bicycles.models.Tandem;

public class BikeRideThree implements BikeRideI{
    private final Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle) {
        this.bicycle=bicycle;
    }
    @Override
    public void ride(Bicycle bicycle) {

        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }

    public int currentSpeed() {
        return bicycle.currentSpeed();
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Tandem();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycle);
        System.out.println(bikeRide.currentSpeed());
    }
}
