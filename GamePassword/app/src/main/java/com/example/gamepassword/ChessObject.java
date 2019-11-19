package com.example.gamepassword;

import java.util.HashMap;

public class ChessObject implements GameObject {
    HashMap<Integer, String> chessBoard;
    public ChessObject(){
        chessBoard = new HashMap<>();
    }
    public void placePiece(Integer space, String piece){
        if(!chessBoard.containsKey(space)){
            chessBoard.put(space, piece);
        }
    }

    public boolean hasPiece(Integer space){
        return chessBoard.containsKey(space);
    }

    @Override
    public String returnHash() {
        byte[] hashedBoard = MainActivity.db.hashed(chessBoard.toString(), "Chess".getBytes());
        return new String(hashedBoard);
    }
}
