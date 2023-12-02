package com.bridgelabz.snakeandladdersimulator;

/**
 * @desc: snake and ladder simulator main class
 */
public class SnakeAndLadderMain {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");
        SnakeAndLadderGame player1 = new SnakeAndLadderGame();
        System.out.println("Player 1 is at position : " + player1.getPosition());
        System.out.println("Player 1 rolls the die and got : " + player1.rollDie());
    }
}
