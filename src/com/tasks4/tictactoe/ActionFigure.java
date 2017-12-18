package com.tasks4.tictactoe;

public enum ActionFigure {
    //нулик
    NOUGHT,
    //хрестик
    CROSS;

    @Override
    public String toString() {
        switch (this){
            case CROSS: return "x";
            case NOUGHT: return "o";
            default: return " ";
        }
    }
}