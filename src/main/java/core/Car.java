package core;

import java.util.Random;

public class Car {

    private int moveDistance;

    private boolean decideOnMove() {
        Random random = new Random();
        int value = random.nextInt(10);
        return value > 3 ? true : false;
    }

    public void move(){
        if(decideOnMove()){
            moveDistance++;
        }
    }

    public int getMoveDistance(){
        return moveDistance;
    }





}

