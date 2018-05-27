import controller.RacingGameController;
import view.GameView;

public class RaceGameRun {

    public static void main(String[] args){
       RaceGameRun raceGameRun = new RaceGameRun();
       raceGameRun.run();
    }

    public void run(){
        GameView gameView = new GameView();
        RacingGameController racingGameController = new RacingGameController();
        gameView.setRacingGameController(racingGameController);
        racingGameController.setGameView(gameView);

        gameView.drawOnViewForInputValue();
    }


}
