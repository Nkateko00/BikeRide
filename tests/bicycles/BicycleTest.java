package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {



    @Test
    public void shouldAccelerateRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateTandemBike() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(12, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateBrakeRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateBrakeMountainBike() {
        MountainBike  bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateBrakeTandemBike() {
        Tandem  bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectlyMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(15, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectlyTandemBike() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(36, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectlyRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(33, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectlyMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(1, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectlyTandemBike() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(3, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectlyRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(10, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToStopMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }
    @Test
    public void shouldBeAbleToStopTandemBike() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }
    @Test
    public void shouldBeAbleToStopRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }

    @Test
    public void speedShouldBeZeroWhenBrakeMultipleTimesMountainBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.brake();
        assertEquals(0, bicycle.currentSpeed());

    }
    @Test
    public void speedShouldBeZeroWhenBrakeMultipleTandemBike() {
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(0, bicycle.currentSpeed());

    }
    @Test
    public void speedShouldBeZeroWhenBrakeMultipleTimesRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.brake();
        bicycle.brake();
        assertEquals(0, bicycle.currentSpeed());

    }
    @Test
    public void shouldNotBrakeWithoutAccelerationMountainBike(){
        MountainBike  bicycle = new MountainBike();
        bicycle.brake();
        bicycle.brake();
        assertEquals(0, bicycle.currentSpeed());
    }
    @Test
    public void shouldNotBrakeWithoutAccelerationTandemBike(){
        Tandem  bicycle = new Tandem();
        bicycle.brake();
        bicycle.brake();
        assertEquals(0, bicycle.currentSpeed());
    }
    @Test
    public void shouldNotBrakeWithoutAccelerationRoadBike(){
        RoadBike bicycle = new RoadBike();
        bicycle.brake();
        bicycle.brake();
        assertEquals(0, bicycle.currentSpeed());
    }

    @Test
    public void shouldGetSpeedOfTwentyWhenAccelerateFourTimeMountainBike(){
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(20,bicycle.currentSpeed());
    }

    @Test
    public void shouldGetSpeedOfFourtyFourWhenAccelerateFourTimeRoadBike(){
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(44,bicycle.currentSpeed());
    }
    @Test
    public void shouldGetSpeedOfSixtyWhenAccelerateFiveTimeTandemBike(){
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(60,bicycle.currentSpeed());
    }
}