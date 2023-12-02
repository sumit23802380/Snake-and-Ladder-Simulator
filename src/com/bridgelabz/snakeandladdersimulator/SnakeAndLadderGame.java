package com.bridgelabz.snakeandladdersimulator;

import java.util.Random;

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

    /**
     * @desc: Method to roll the die
     * @params :
     * @return : value that die gets between 1 and 6
     */
    public int rollDie(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}
