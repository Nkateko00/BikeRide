package bicycles;

import bicycles.*;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleSpecificationTests {

        @Test
        public void shouldTakeMountainBikesRideOne() {

            //constructor has 3 parameters
            BicycleSpecification bicycleSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
            Bicycle bicycleSpecification = new BicycleFromSpec(bicycleSpec);
            Bicycle bicycle = new MountainBike();
            BikeRide bikeRide= new BikeRide(bicycle);
            bikeRide.ride(bicycleSpecification);
            assertEquals(5, bikeRide.currentSpeed());
        }
    @Test
    public void shouldTakeMountainBikeRideTwo() {
        //constructor has 3 parameters
        BicycleSpecification bicycleSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
        Bicycle bicycleSpecification = new BicycleFromSpec(bicycleSpec);
        Bicycle bicycle = new MountainBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycleSpecification);
        assertEquals(16, bicycle.currentSpeed());

    }
        @Test
        public void shouldTakeMountainBikeRideThree() {

            //constructor has 3 parameters
            BicycleSpecification bicycleSpec = new BicycleSpecification(5,3,BicycleType.MountainBike);
            Bicycle bicycleSpecification = new BicycleFromSpec(bicycleSpec);
            Bicycle bicycle = new MountainBike();
            BikeRideThree bikeRide = new BikeRideThree(bicycle);
            bikeRide.ride(bicycleSpecification);
            assertEquals(49, bicycle.currentSpeed());
        }
        @Test
        public void shouldTakeRoadBikeRideOne() {

            //3 parameters
            BicycleSpecification bicycleSpec = new BicycleSpecification(11,4,BicycleType.RoadBike);
            Bicycle bicycleSpecification = new BicycleFromSpec(bicycleSpec);
            Bicycle bicycle = new RoadBike();
            BikeRide bikeRide = new BikeRide(bicycle);
            bikeRide.ride(bicycleSpecification);
            assertEquals(24, bicycle.currentSpeed());
        }
    @Test
    public void shouldTakeRoadBikeRideTwo() {
        //3 parameters
        BicycleSpecification bicycleSpec = new BicycleSpecification(11,4,BicycleType.RoadBike);
        Bicycle bicycleSpecification = new BicycleFromSpec(bicycleSpec);
        Bicycle bicycle = new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycleSpecification);
        assertEquals(43, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeRoadBikeRideThree() {
        //3 parameters
        BicycleSpecification bicycleSpec = new BicycleSpecification(11,4,BicycleType.RoadBike);
        Bicycle bicycleSpecification = new BicycleFromSpec(bicycleSpec);
        Bicycle bicycle = new RoadBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycleSpecification);
        assertEquals(113, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeTandemBikeRideOne() {
        //3 parameters
        BicycleSpecification bicycleSpec = new BicycleSpecification(12,7,BicycleType.Tandem);
        Bicycle bicycleSpecification = new BicycleFromSpec(bicycleSpec);
        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride(bicycleSpecification);
        assertEquals(13, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeTandemBikeRideTwo() {
        //3 parameters
        BicycleSpecification bicycleSpec = new BicycleSpecification(12,7,BicycleType.Tandem);
        Bicycle bicycleSpecification = new BicycleFromSpec(bicycleSpec);
        Bicycle bicycle = new Tandem();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycleSpecification);
        assertEquals(39, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeTandemBikeRideThree() {
        //3 parameters
        BicycleSpecification bicycleSpec = new BicycleSpecification(12,7,BicycleType.Tandem);
        Bicycle bicycleSpecification = new BicycleFromSpec(bicycleSpec);
        Bicycle bicycle = new Tandem();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycleSpecification);
        assertEquals(118, bicycle.currentSpeed());
    }
    }

