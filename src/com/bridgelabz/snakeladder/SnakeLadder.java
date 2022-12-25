package com.bridgelabz.snakeladder;

public class SnakeLadder {

    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    public static int getRandomInteger(int maximum, int minimum)
    {
        return ((int) (Math.random()*(maximum - minimum))) + minimum;

    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;

    }
    public static void main(String[] args){
        System.out.println("Welcome To Snake And Ladder Game Program");
        int startPositionA = 0;

        int dice = getRandomInteger(7,1);
        System.out.println(dice);
        int checkPlay = (int) Math.floor(Math.random()*10)%3;
        System.out.println(checkPlay);

        switch(checkPlay)
        {
            case NO_PLAY:
                break;

            case LADDER:
                startPositionA += dice;
                break;

            case SNAKE:
                startPositionA -= dice;
                break;
        }


        int dice = getRandomInteger(7,1);
        System.out.println(dice);



    }
}