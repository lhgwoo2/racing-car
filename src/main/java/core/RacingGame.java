package core;

import java.util.ArrayList;

public class RacingGame {

    private ArrayList<Car> carList = new ArrayList();
    private ArrayList<GameResult> results = new ArrayList();
    private int trys;

    public RacingGame(int cars, int trys) {
        this.trys = trys;
        for (int i = 0; i < cars; i++) {
            carList.add(new Car());
        }
    }

    public ArrayList<GameResult> play() {
        for (int j = 0; j < trys; j++) {
            for (int i = 0; i < carList.size(); i++) {
                Car car = carList.get(i);
                car.move();
            }
            GameResult result = new GameResult();
            result.saveCarsDistance(carList);
            results.add(result);
        }
        return results;
    }



}

