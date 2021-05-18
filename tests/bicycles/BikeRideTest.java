package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    @Test
    public void shouldRideBikeAndGetCurrentSpeedRideOne(){
        Bicycle bicycle= new MountainBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(31,bikeRide.currentSpeed());
    }
    @Test
    public void shouldRideBikeAndGetCurrentSpeedRideTwo(){
        Bicycle bicycle= new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(76,bikeRide.currentSpeed());
    }
    @Test
    public void shouldRideBikeAndGetCurrentSpeedRideThree(){
        Bicycle bicycle= new Tandem();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(118,bikeRide.currentSpeed());
    }
}
