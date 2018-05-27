package view;

import controller.RacingGameController;
import core.GameResult;

import java.util.ArrayList;
import java.util.Scanner;

public class GameView {

    public interface RaceGameInputListener {
        void callbackRaceGameInputData(int cars, int trys);
    }

    private RacingGameController racingGameController;

    public GameView() {
    }

    public void setRacingGameController(RacingGameController racingGameController) {
        this.racingGameController = racingGameController;
    }

    public void drawOnViewForInputValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대 수는 몇 대 인가요?");
        int cars = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int trys = scanner.nextInt();
        racingGameController.callbackRaceGameInputData(cars, trys);
    }

    public void drawOnGameResult(ArrayList<GameResult> results) {
        System.out.println("실행 결과");
        for (int i = 0; i < results.size(); i++) {
            GameResult gameResult = results.get(i);
            ArrayList<Integer> carsDistance = gameResult.getCarsDistance();
            for (int k = 0; k < carsDistance.size(); k++) {
                int carDistance = carsDistance.get(k);
                String distance = "";
                for (int j = 0; j < carDistance; j++) {
                    distance += "-";
                }
                System.out.println(distance);
            }
            if(i != results.size()-1){
                System.out.println();
                System.out.println();
            }
        }
    }


}
