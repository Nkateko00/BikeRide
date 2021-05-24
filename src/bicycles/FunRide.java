package bicycles;

import java.util.*;

public class FunRide {
    private int maximumPerRide;

    List<Bicycle> list = new ArrayList<Bicycle>();

 public FunRide(int maximumPerRide){
        this.maximumPerRide=maximumPerRide;
    }
    public void accept(Bicycle bicycle){

        if(this.list.size()>=maximumPerRide){
            System.out.println("Maximum Rides Reached!You cannot add more rides!");
        }else{
            this.list.add(bicycle);
        }
    }
        public int getEnteredCount() {
        return list.size();
        //return everything entered in the list
    }

    public int getCountForType(BicycleType bicycle){
        int counter = 0;
        //for each loop
        for(Bicycle ride : list){
            if(bicycle.equals(ride.getBicycleType())){
                counter++;
            }
        }
        return counter;
    }

}
