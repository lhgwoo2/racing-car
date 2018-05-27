package core;

import java.util.ArrayList;

public class GameResult {

    private ArrayList<Integer> carsDistance;
    public GameResult(){}

    public void saveCarsDistance(ArrayList<Car> carList){
        carsDistance = new ArrayList<Integer>();
        for(Car car : carList){
            carsDistance.add(car.getMoveDistance());
        }
    }
    public ArrayList<Integer> getCarsDistance(){
        return carsDistance;
    }
}
