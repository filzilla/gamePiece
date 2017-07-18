package com.company;

/**
 * Created by phillipdelia on 7/18/17.
 */
public class GamePiece {


    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;


    public GamePiece(){

        positionX = 0;
        positionY = 0;
        frozen = false;

    }

    public boolean isFrozen(){

        return frozen;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }


    public void movePiece(int positionX, int positionY){
        if (frozen == false) {

            this.positionX = positionX;
            this.positionY = positionY;
        }else{

            System.out.println("Your piece is frozen, and you cannot move.");
        }

    }

    public boolean freezePiece(){

            frozen = true;
            return frozen;
        }

    public boolean unfreezePiece(){

            frozen = false;
            return frozen;
        }

}
