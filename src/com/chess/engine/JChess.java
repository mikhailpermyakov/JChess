package com.chess.engine;

import com.chess.engine.board.Board;

/**
 * Created by PermyakovME on 30.06.2017.
 */
public class JChess {


    public static void main(String[] args) {
        Board board = Board.createStandardBoard();
        System.out.println(board);
    }
}
