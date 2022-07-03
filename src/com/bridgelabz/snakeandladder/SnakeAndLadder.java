package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    static int position = 0;
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game:");

        System.out.println();
        System.out.println("Rolling the die...");
        int die = (int)(Math.random() * 6)+1;
        System.out.println("Die number is :"+die);

        int option = (int)(Math.random() * 3);

        switch(option){
            case NO_PLAY:
                System.out.println("Player remains in same position :"+position);
                break;
            case LADDER:
                position =position + die;
                System.out.println("Ladder ! Player moves forward "+die+" places. Player is now in position :"+position);
                break;
            case SNAKE:
                position =position - die;
                System.out.println("Snake ! Player moves backward "+die+" places. Player is now in position :"+position);
                break;
        }
        System.out.println();
    }

}
