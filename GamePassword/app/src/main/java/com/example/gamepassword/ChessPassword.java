package com.example.gamepassword;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChessPassword {
    private DBHelper db = MainActivity.db;
    ArrayList<String>[] chessBoard;

    public ChessPassword(){
        chessBoard = new ArrayList[65];
        Arrays.fill(chessBoard, new ArrayList<String>());
        chessBoard[chessBoard.length-1].add("chess");
    }

    public void fillBoard(){
        int first = (4*8)+3; //row 5, place 4
        int second = (0*8)+1; //row 1, place 2
        int third = (7*8)+7; //row 8, place 8
        for (int i = 0;i<chessBoard.length;i++){
            if(i==first){
                chessBoard[i].addAll(Collections.singletonList("black knight"));
            }
            else if (i==second){
                chessBoard[i].addAll(Collections.singletonList("white king"));
            }
            else if (i==third){
                chessBoard[i].addAll(Arrays.asList("white king","black pawn"));
            }
        }
    }

    public ArrayList<String>[] passBoard(){
        return chessBoard;
    }
}
