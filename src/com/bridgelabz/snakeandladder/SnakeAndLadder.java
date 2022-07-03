package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    int position = 0;
    int die =0;
    int dieCounter =0;
    int playerNum =0;

    final int NO_PLAY = 0;
    final int LADDER = 1;
    final int SNAKE = 2;

    final int MIN_POS = 0;
    static final int MAX_POS = 100;

    SnakeAndLadder(int playerNum){
        this.playerNum =playerNum;
    }

    public int dieRoll(){

        System.out.println("Rolling the die...");
        die = (int)(Math.random() * 6)+1;
        System.out.println("Die number is :"+die);
        return die;
    }

    public int options(int playerNum, int die, int position){

        while(position <=MAX_POS){
            int option = (int)(Math.random() * 3);

            switch(option){
                case NO_PLAY:

                    System.out.println("Player "+playerNum+" remains at the same position :"+position);
                    break;

                case LADDER:

                    if( (position + die) > MAX_POS){
                        System.out.println("Player "+playerNum+" remains at the same position :"+position);
                    }else{
                        position =position + die;
                        System.out.println("Ladder ! Player "+playerNum+" moves forward "+die+" places. Player is now at position :"+position);
                    }

                    break;

                case SNAKE:

                    if ( (position - die) <MIN_POS){
                        System.out.println("Player "+playerNum+" remains at the same position :"+position);
                    }else{
                        position =position - die;
                        System.out.println("Snake ! Player "+playerNum+" moves backward "+die+" places. Player is now at position :"+position);
                    }

                    break;
            }
            System.out.println();

            if (position == MAX_POS){
                System.out.println("Player "+playerNum+" reached position "+MAX_POS+"! Player wins!");
                break;
            }

            if (position == LADDER){
                continue;
            }else{

                break;
            }

        }
        return position;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game:");
        System.out.println();

        int playerPosition =0 ;
        int playerTurn =0;

        SnakeAndLadder player1 = new SnakeAndLadder(1);
        SnakeAndLadder player2 = new SnakeAndLadder(2);


        if(Math.random() < 0.5){
            System.out.println("Player 1 starts the game.");
            player1.die = player1.dieRoll();
            player1.dieCounter++;
            playerPosition = player1.options(player1.playerNum,player1.die,player1.position);
            player1.position = playerPosition;
            playerTurn = 2;
        }else {
            System.out.println("Player 2 starts the game.");
            player2.die = player2.dieRoll();
            player2.dieCounter++;
            playerPosition = player2.options(player2.playerNum,player2.die,player2.position);
            player2.position = playerPosition;
            playerTurn =1;
        }

        while (playerTurn == 1 || playerTurn == 2){

            if(playerTurn == 1){
                player1.die = player1.dieRoll();
                player1.dieCounter++;
                playerPosition = player1.options(player1.playerNum,player1.die,player1.position);
                player1.position = playerPosition;

                if(playerPosition == MAX_POS){
                    System.out.println("Player "+player1.playerNum+" rolled the die "+player1.dieCounter+" times.");
                    break;
                }else{
                    playerTurn = 2;
                }

            }

            if(playerTurn == 2){
                player2.die = player2.dieRoll();
                player2.dieCounter++;
                playerPosition = player2.options(player2.playerNum,player2.die,player2.position);
                player2.position = playerPosition;

                if(playerPosition == MAX_POS){
                    System.out.println("Player "+player2.playerNum+" rolled the die "+player2.dieCounter+" times.");
                    break;
                }else{
                    playerTurn = 1;
                }

            }

        }


    }



}