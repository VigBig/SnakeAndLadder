package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    static int position = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game:");

        System.out.println();
        System.out.println("Rolling the die...");
        int die = (int)(Math.random() * 6)+1;
        System.out.println("Die number is :"+die);

    }

}
