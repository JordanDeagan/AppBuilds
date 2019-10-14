package com.example.gamepassword;

import java.util.HashMap;

public class ChessObject implements GameObject {
    HashMap<Integer,String> chessBoard;
    @Override
    public String returnHash() {
        byte[] hashedBoard = MainActivity.db.hashed(chessBoard.toString(), "Chess".getBytes());
        return new String(hashedBoard);
    }
}
