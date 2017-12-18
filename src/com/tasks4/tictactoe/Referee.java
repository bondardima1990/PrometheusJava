package com.tasks4.tictactoe;

import static com.tasks4.tictactoe.Board.SIZE;

public class Referee {

    public void put(Move move, Board board) {
        board.actionFigures[move.getX()][move.getY()] = move.getFigure();
    }

    public boolean isWin(Move move, Board board) {
        int horizontalLine = 0;
        int verticalLine = 0;
        int rightDiagonalLine = 0;
        int leftDiagonalLine = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (move.getFigure() == board.actionFigures[i][j]){
                    if (i == j)
                        rightDiagonalLine++;
                    if (i == SIZE - j - 1)
                        leftDiagonalLine++;
                    if (i == move.getX())
                        horizontalLine++;
                    if (j == move.getY())
                        verticalLine++;
                }
            }
        }
        return horizontalLine == SIZE || verticalLine == SIZE || rightDiagonalLine == SIZE || leftDiagonalLine == SIZE;
    }
}