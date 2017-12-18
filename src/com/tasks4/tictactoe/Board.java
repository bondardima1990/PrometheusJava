package com.tasks4.tictactoe;

public class Board {

    public static final int SIZE = 3;

    public ActionFigure[][] actionFigures;

    Board() {
        actionFigures = new ActionFigure[SIZE][SIZE];
    }

    public boolean hasMoreSpace() {
        int freeSpaceCount = 0;
        for (int i = 0; i < actionFigures.length; i++) {
            for (int j = 0; j < actionFigures[i].length; j++) {
                if (actionFigures[i][j] == null)
                    freeSpaceCount++;
            }
        }
        return freeSpaceCount >= 2;
    }

    public void print() {
        for (int i = 0; i < actionFigures.length; i++) {
            for (int j = 0; j < actionFigures[i].length; j++) {
                if (actionFigures[i][j] != null)
                    System.out.print(actionFigures[i][j].toString() + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}