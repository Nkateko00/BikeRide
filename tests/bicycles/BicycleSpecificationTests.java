package bicycles;

import bicycles.*;
import bicycles.models.RoadBike;
import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleSpecificationTests {

        @Test
        public void shouldTakeMountainBikeRideOne() {
            //constructor has 3 parameters
            BicycleSpecification bicycleSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
            Bicycle bicycle = new BicycleFromSpec(bicycleSpec);
            BikeRide bikeRide = new BikeRide(bicycle);
            bikeRide.ride(bicycle);
            assertEquals(5, bicycle.currentSpeed());

        }
        @Test
        public void shouldTakeMountainBikesRideTwo() {

            //constructor has 3 parameters
            BicycleSpecification bicycleSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
            Bicycle bicycle = new BicycleFromSpec(bicycleSpec);
            BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
            bikeRide.ride(bicycle);
            assertEquals(10, bicycle.currentSpeed());
        }
        @Test
        public void shouldTakeMountainBikeRideThree() {


            //constructor has 3 parameters
            BicycleSpecification bicycleSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
            Bicycle bicycle = new BicycleFromSpec(bicycleSpec);
            BikeRideThree bikeRide = new BikeRideThree(bicycle);
            bikeRide.ride(bicycle);
            assertEquals(44, bicycle.currentSpeed());
        }
        @Test
        public void shouldTakeRoadBikeRideOne() {

            //3 parameters
            BicycleSpecification bicycleSpec = new BicycleSpecification(11,4,BicycleType.RoadBike);
            Bicycle bicycle = new BicycleFromSpec(bicycleSpec);
            BikeRide bikeRide = new BikeRide(bicycle);
            bikeRide.ride(bicycle);
            assertEquals(24, bicycle.currentSpeed());
        }

    }

