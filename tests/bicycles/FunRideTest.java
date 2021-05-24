package bicycles;
import bicycles.*;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldAcceptMountainBike() {

        FunRide theRide = new FunRide(7);
        Bicycle bicycle1 = new RoadBike();
        Bicycle bicycle2 = new MountainBike();
        Bicycle bicycle3 = new Tandem();
        theRide.accept(bicycle2);
        assertEquals(1, theRide.getEnteredCount());

    }

    @Test
    public void shouldAcceptRoadBike() {

        FunRide theRide = new FunRide(7);
        Bicycle bicycle1 = new RoadBike();
        Bicycle bicycle2 = new MountainBike();
        Bicycle bicycle3 = new Tandem();
        theRide.accept(bicycle1);
        assertEquals(1, theRide.getEnteredCount());

    }


    @Test
    public void shouldAcceptTandemBike() {

        FunRide theRide = new FunRide(7);
        Bicycle bicycle1 = new RoadBike();
        Bicycle bicycle2 = new MountainBike();
        Bicycle bicycle3 = new Tandem();
        theRide.accept(bicycle3);
        assertEquals(1, theRide.getEnteredCount());

    }

    @Test
    public void shouldAccept5TandemBike() {

        FunRide theRide = new FunRide(7);
        Bicycle bicycle1 = new RoadBike();
        Bicycle bicycle2 = new MountainBike();
        Bicycle bicycle3 = new Tandem();
        Bicycle bicycle4 = new Tandem();
        Bicycle bicycle5 = new Tandem();
        Bicycle bicycle6 = new Tandem();
        Bicycle bicycle7  = new Tandem();
        theRide.accept(bicycle3);
        theRide.accept(bicycle4);
        theRide.accept(bicycle5);
        theRide.accept(bicycle6);
        theRide.accept(bicycle7);
        assertEquals(5, theRide.getEnteredCount());

    }
    @Test
    public void shouldAcceptMaximumBikes() {

        FunRide theRide = new FunRide(7);
        Bicycle bicycle1 = new RoadBike();
        Bicycle bicycle2 = new MountainBike();
        Bicycle bicycle3 = new Tandem();
        Bicycle bicycle4 = new RoadBike();
        Bicycle bicycle5 = new Tandem();
        Bicycle bicycle6 = new MountainBike();
        Bicycle bicycle7  = new Tandem();
        theRide.accept(bicycle1);
        theRide.accept(bicycle2);
        theRide.accept(bicycle3);
        theRide.accept(bicycle4);
        theRide.accept(bicycle5);
        theRide.accept(bicycle6);
        theRide.accept(bicycle7);
        assertEquals(7, theRide.getEnteredCount());

    }
    @Test
    public void shouldNotAcceptEightBike(){
        FunRide theRide = new FunRide(7);
        Bicycle bicycle1 = new Tandem();
        Bicycle bicycle2 = new MountainBike();
        Bicycle bicycle3 = new RoadBike();
        Bicycle bicycle4 = new MountainBike();
        Bicycle bicycle5 = new RoadBike();
        Bicycle bicycle6 = new Tandem();
        Bicycle bicycle7 = new Tandem();
        Bicycle bicycle8 = new MountainBike();
        theRide.accept(bicycle1);
        theRide.accept(bicycle2);
        theRide.accept(bicycle3);
        theRide.accept(bicycle4);
        theRide.accept(bicycle5);
        theRide.accept(bicycle6);
        theRide.accept(bicycle7);
        theRide.accept(bicycle8);
        assertEquals(7, theRide.getEnteredCount());
    }
}