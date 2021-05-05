package bicycles;

public class Bicycle {

    private int speed ;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        if(speed > 0) {
            speed -= 3;
        }else{
            speed = 0;
        }
    }
    public void stop (){
        speed = 0;
    }
    public int currentSpeed(){
        return speed;
    }

}