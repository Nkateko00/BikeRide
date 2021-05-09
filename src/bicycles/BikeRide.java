package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;

public class BikeRide {

    public  RoadBike bicycle;
    public  MountainBike bicycle2;

    public BikeRide(RoadBike bicycle,MountainBike bicycle2){

        this.bicycle2=bicycle;
        this.bicycle=bicycle;
    }

    public void ride(){
        this.bicycle2.accelerate();
        this.bicycle.accelerate();
         this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed(){


        return this.bicycle.currentSpeed();
    }

    public static void main(String[] args) {
        RoadBike bicycle= new RoadBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        MountainBike bicycle2= new MountainBike();
        MountainBike bikeRide2 = new MountainBike(bicycle2);
        bikeRide2.ride();
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
    }
}
