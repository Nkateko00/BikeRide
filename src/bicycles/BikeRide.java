package bicycles;

import bicycles.models.MountainBike;

public class BikeRide implements BikeRideI{

    public  Bicycle bicycle;

    public BikeRide(Bicycle bicycle) {

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
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        }

        public int currentSpeed(){
            return
                   this.bicycle.currentSpeed();
        }

        public static void main(String[] args) {
            Bicycle bicycle= new MountainBike();
            BikeRide bikeRide = new BikeRide(bicycle);
            bikeRide.ride(bicycle);
            System.out.println(bikeRide.currentSpeed());

        }
    }

