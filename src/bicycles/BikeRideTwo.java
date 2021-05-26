package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;

public class BikeRideTwo implements BikeRideI{

    private final Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle) {

        this.bicycle=bicycle;
    }

    @Override
    public void ride(Bicycle bicycle) {

        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();

    }
        public int currentSpeed(){
            return
                    this.bicycle.currentSpeed();
        }

    public static void main(String[] args) {
        Bicycle bicycle= new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        System.out.println(bikeRide.currentSpeed());

    }
    }

