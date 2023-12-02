package com.bridgelabz.snakeandladdersimulator;

/**
 * @desc: snake and ladder simulator main class
 */
public class SnakeAndLadderMain {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");
        SnakeAndLadderGame player1 = new SnakeAndLadderGame();
        SnakeAndLadderGame player2 = new SnakeAndLadderGame();
        while ((player1.getPosition() < 100) && (player2.getPosition()<100)){
            player1.play();
            if(player1.getPosition() < 100){
                player2.play();
            }
        }
        if(player1.getPosition() == 100){
            System.out.println("Player 1 Won");
        }
        else{
            System.out.println("Player 2 Won");
        }
        System.out.println("Player 1 number of times the die is rolled is : " + player1.getNumberOfTimesDieRolled());
        System.out.println("Player 2 number of times the die is rolled is : " + player2.getNumberOfTimesDieRolled());
    }
}
