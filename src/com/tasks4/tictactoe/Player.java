package com.tasks4.tictactoe;

import java.util.Random;

public class Player {

    private ActionFigure figure;

    Player(ActionFigure figure) {
        this.figure = figure;
    }

    public Move turn(Board board) {
        Random random = new Random();
        Move step = new Move(random.nextInt(3), random.nextInt(3), figure);
        while (board.actionFigures[step.getX()][step.getY()] != null)
            step = new Move(random.nextInt(3), random.nextInt(3), figure);
        return step;
    }
}