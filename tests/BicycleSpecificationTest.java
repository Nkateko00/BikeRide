import bicycles.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {


        @Test
        public void shouldTakeMountainBikeOne() {
            //constructor has 3 parameters
            BicycleSpecification bikeSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
            Bicycle bicycle = new BicycleFromSpec(bikeSpec);
            BikeRide bikeRide = new BikeRide(bicycle);
            bikeRide.ride(bicycle);
            assertEquals(5, bicycle.currentSpeed());
        }

    }
