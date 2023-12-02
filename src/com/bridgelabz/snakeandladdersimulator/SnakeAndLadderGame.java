package com.bridgelabz.snakeandladdersimulator;

/**
 * @desc: Snake and Ladder Game Class
 */
public class SnakeAndLadderGame {
    private int position;

    /**
     * @desc: Constructor to set the initial position of the player with 0
     */
    public SnakeAndLadderGame(){
        this.position = 0;
    }

    /**
     * @desc: Method to get the current position of the user
     * @params :
     * @return : integer position of the class
     */
    public int getPosition(){
        return this.position;
    }
}
