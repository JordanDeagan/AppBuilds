package com.example.gamepassword;

import java.util.HashMap;

public class MonopolyObject implements GameObject {
    HashMap<Integer, String> monopolyBoard;
    public MonopolyObject(){
        monopolyBoard = new HashMap<>();
    }
    public void placePiece(Integer space, String piece){
        if(!monopolyBoard.containsKey(space)){
            monopolyBoard.put(space, piece);
        }
    }

    public boolean hasPiece(Integer space){
        return monopolyBoard.containsKey(space);
    }

    @Override
    public String returnHash() {
        byte[] hashedBoard = MainActivity.db.hashed(monopolyBoard.toString(), "Monopoly".getBytes());
        return new String(hashedBoard);
    }
}
