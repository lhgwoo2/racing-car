package racegame.controller;

import racegame.core.GameResult;
import racegame.core.RacingGame;
import racegame.view.GameView;

import java.util.ArrayList;

public class RacingGameController implements GameView.RaceGameInputListener {

    private ArrayList<GameResult> gameResults;      //model
    private GameView gameView;                      //view
    private RacingGame racingGame;


    public void setGameView(GameView gameView){
        this.gameView = gameView;
    }

    @Override
    public void callbackRaceGameInputData(int cars, int trys) {
        racingGame = new RacingGame(cars, trys);
        gameResults = racingGame.play();
        gameView.drawOnGameResult(gameResults);
    }


}
