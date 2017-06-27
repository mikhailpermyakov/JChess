package com.chess.engine;

/**
 * Created by Михаил on 25.06.2017.
 */
public enum Alliance {
    WHITE {
        @Override
        public int getDirection() {
            return -1;
        }
    },
    BLACK {
        @Override
        public int getDirection() {
            return 1;
        }
    };

    public abstract int getDirection();
}
