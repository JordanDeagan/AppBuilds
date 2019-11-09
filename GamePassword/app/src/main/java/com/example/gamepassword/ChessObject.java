package com.example.gamepassword;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class ChessObject implements GameObject {
    HashMap<Integer, LinkedList<String>> chessBoard;
    public ChessObject(){
        chessBoard = new HashMap<>();
    }
    public void placePiece(Integer space, String piece){
        if(chessBoard.containsKey(space)){
            LinkedList<String> temp = chessBoard.get(space);
            temp.add(piece);
            chessBoard.put(space, temp);
        }
        else {
            LinkedList<String> temp = new LinkedList<>(Collections.singletonList(piece));
            chessBoard.put(space, temp);
        }
    }

    public boolean hasPiece(Integer space){
        return chessBoard.containsKey(space);
    }

    public String getPiece(Integer space){
        if (chessBoard.containsKey(space)){
            return chessBoard.get(space).getFirst();
        }
        return null;
    }

    @Override
    public String returnHash() {
        byte[] hashedBoard = MainActivity.db.hashed(chessBoard.toString(), "Chess".getBytes());
        return new String(hashedBoard);
    }
}
