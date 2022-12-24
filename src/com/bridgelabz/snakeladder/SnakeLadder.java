package com.bridgelabz.snakeladder;

public class SnakeLadder {
    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }
    public static void main(String[] args){
        System.out.println("Welcome To Snake And Ladder Game Program");
        int startPositionA = 0;
        int dice = getRandomInteger(7,1);
        System.out.println(dice);
    }
}