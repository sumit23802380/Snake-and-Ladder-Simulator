package com.bridgelabz.snakeandladdersimulator;
import java.util.HashMap;
import java.util.Random;

/**
 * @desc: Snake and Ladder Game Class
 */
public class SnakeAndLadderGame {
    private int position;
    private HashMap<Integer,Integer> snakes;
    private HashMap<Integer,Integer> ladders;



    /**
     * @desc: Constructor to set the initial position of the player with 0
     */
    public SnakeAndLadderGame(){
        this.position = 0;
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
        initializeBoardWithSnakesAndLadders();
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
    /**
     * @desc: Method to get the Random number between 1 and 100 on board
     * @params :
     * @return : integer random number between 1 and 100
     */
    private int getRandomNumberOnBoard(){
        Random random = new Random();
        return random.nextInt(100)+1;
    }
    /**
     * @desc: method to initialize board with snakes and ladder randomly 5
     * @params :
     * @return :
     */
    private void initializeBoardWithSnakesAndLadders(){
        //add 5 snakes
        for(int i=1;i<=5;i++){
            int point1 = getRandomNumberOnBoard();
            int point2 = getRandomNumberOnBoard();
            if(point1 == point2){
                continue;
            }
            else if(point1 > point2){
                int temp = point1;
                point1 = point2;
                point2 = temp;
            }
            System.out.println("Snake : "+ i + " on Position : " + point2 + " " + point1);
            this.snakes.put(point2,point1);
        }

        for(int i=1;i<=5;i++){
            int point1 = getRandomNumberOnBoard();
            int point2 = getRandomNumberOnBoard();
            if(point1 == point2){
                continue;
            }
            else if(point1 > point2){
                int temp = point1;
                point1 = point2;
                point2 = temp;
            }
            System.out.println("Ladder : "+ i + " on Position : " + point1 + " " + point2);
            this.ladders.put(point1,point2);
        }
    }

    /**
     * @desc: Method to get the Random number between 1 and 4 for options
     * @params :
     * @return :
     */
    private int getRandomOption(){
        Random random = new Random();
        return random.nextInt(3)+1;
    }

    /**
     * @desc: Method to set the position
     * @params : int posiion
     * @return : newPosition
     */
    private int setPosition(int position){
        this.position = position;
        return position;
    }
    /**
     * @desc: Method to play the move first options , then rolls the die
     * @params :
     * @return :
     */
    public void play(){
        int playerGotRandomOption = getRandomOption();
        if(playerGotRandomOption > 1){
            // play
            int dieRoll = rollDie();
            System.out.println("Player  rolls the die and got : " + dieRoll);
            int currentPosition = getPosition();
            int newPosition = currentPosition+dieRoll;
            if(snakes.containsKey(newPosition)){
                System.out.println("Now player got the snake at position : " + newPosition);
                newPosition = setPosition(snakes.get(newPosition));
            }
            else if(ladders.containsKey(newPosition)){
                System.out.println("Now player got the ladder at position : " + newPosition);
                newPosition = setPosition(ladders.get(newPosition));
            }
            System.out.println("Player gets the position : " + setPosition(newPosition));
        }
        else{
            System.out.println("Player got the no play ");
        }
    }
}
