package bicycles;

public class BikeRide {

    public final Bicycle bicycle;

    public BikeRide(Bicycle bicycle){
        this.bicycle=bicycle;
    }

    public void ride(){
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
        Bicycle bicycle= new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
    }
}
