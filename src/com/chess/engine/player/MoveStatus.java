package com.chess.engine.player;

/**
 * Created by Михаил on 01.07.2017.
 */
public enum MoveStatus {
    DONE {
        @Override
        boolean isDone() {
            return true;
        }
    };
    abstract boolean isDone();
}
