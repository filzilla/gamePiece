package com.company;

public class Main {

    public static void main(String[] args) {


        GamePiece bobbyFischer = new GamePiece();

        bobbyFischer.isFrozen();
        System.out.println(bobbyFischer.frozen);

        bobbyFischer.freezePiece();
        System.out.println(bobbyFischer.frozen);

        bobbyFischer.unfreezePiece();
        System.out.println(bobbyFischer.frozen);

        bobbyFischer.movePiece(2,3);
        System.out.println(bobbyFischer.getPositionX());
        System.out.println(bobbyFischer.getPositionY());

        bobbyFischer.freezePiece();
        System.out.println(bobbyFischer.frozen);
        bobbyFischer.movePiece(4,5);
        System.out.println(bobbyFischer.getPositionX());
        System.out.println(bobbyFischer.getPositionY());
    }
}






