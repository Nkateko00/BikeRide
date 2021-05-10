package bicycles;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    @Test
    public void shouldRideBikeAndGetCurrentSpeed(){
        Bicycle bicycle= new MountainBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(19,bikeRide.currentSpeed());
    }

}
