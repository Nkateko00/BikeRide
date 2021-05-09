package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;

public class BikeRide{

    public final RoadBike bicycle;
    public final MountainBike bicycle2;

    public BikeRide(RoadBike bicycle,MountainBike bicycle2){

        this.bicycle2=bicycle2;
        this.bicycle=bicycle;
    }

    public void ride(){
        this.bicycle2.accelerate();
        this.bicycle.accelerate();
         this.bicycle2.accelerate();
        this.bicycle.accelerate();
        this.bicycle2.accelerate();
        this.bicycle.accelerate();
        this.bicycle2.brake();
        this.bicycle.brake();
        this.bicycle2.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }

    public int currentSpeedRoadBike(){
        return
                this.bicycle.currentSpeed();
    }
    public int currentSpeedMountainBike(){
        return
                this.bicycle2.currentSpeed();
    }


    public static void main(String[] args) {
        RoadBike bicycle= new RoadBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        MountainBike bicycle2= new MountainBike();
        MountainBike bikeRide2 = new MountainBike(bicycle2);
        bikeRide2.ride();
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeedRoadBike());
        System.out.println(bikeRide.currentSpeedMountainBike());
    }
}
