import bicycles.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {


        @Test
        public void shouldTakeMountainBikeRideOne() {
            //constructor has 3 parameters
            BicycleSpecification bikeSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
            Bicycle bicycle = new BicycleFromSpec(bikeSpec);
            BikeRide bikeRide = new BikeRide(bicycle);
            bikeRide.ride(bicycle);
            assertEquals(5, bicycle.currentSpeed());

        }
    @Test
    public void shouldTakeMountainBikesRideTwo() {

        //constructor has 3 parameters
        BicycleSpecification bikeSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(bikeSpec);
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(10, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeMountainBikeRideThree() {


        //constructor has 3 parameters
        BicycleSpecification bikeSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(bikeSpec);
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(44, bicycle.currentSpeed());
    }

    }
