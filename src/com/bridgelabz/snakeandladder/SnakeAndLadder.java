package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    static int position = 0;
    static int die =0;
    static int dieCounter =0;

    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    static final int MIN_POS = 0;
    static final int MAX_POS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game:");
        System.out.println();

        while(position <=MAX_POS){
            int option = (int)(Math.random() * 3);

            System.out.println("Rolling the die...");
            die = (int)(Math.random() * 6)+1;
            dieCounter++;
            System.out.println("Die number is :"+die);

            switch(option){
                case NO_PLAY:

                    System.out.println("Player remains at the same position :"+position);
                    break;

                case LADDER:

                    if( (position +die) > MAX_POS){
                        System.out.println("Player remains at the same position :"+position);
                    }else{
                        position =position + die;
                        System.out.println("Ladder ! Player moves forward "+die+" places. Player is now at position :"+position);
                    }

                    break;

                case SNAKE:

                    if (position <MIN_POS){
                        System.out.println("Player remains at the same position :"+position);
                    }else{
                        position =position - die;
                        System.out.println("Snake ! Player moves backward "+die+" places. Player is now at position :"+position);
                    }

                    break;
            }
//            System.out.println(dieCounter);
            System.out.println();

            if (position == MAX_POS){
                System.out.println("Player reached position "+MAX_POS+"! Player wins!");
                break;
            }
        }

        System.out.println("Die was rolled "+dieCounter+" times.");

    }



}