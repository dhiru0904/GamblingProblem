package com.gamblingsimulation;
import java.util.Random;
/*
crate class
 */
public class GamblingSimulation {
    static int stake = 100;
    static int bet = 1;
    static int betNumber=0;
    /*
     win or loss the game
     */
    public static void winLoss()
    {
        Random random=new Random();
        int bet=random.nextInt(2);
        if (bet==1)
        {
            System.out.println("Gambler won the bet");
            stake += bet;
        }
        else
        {
            stake -= bet;
            System.out.println("Gambler loose the bet");
        }
    }
    /*
    wino or lost 50%of the stake resign for the day
     */
    public static int resignDay()
    {
        while (stake != 50 && stake != 150)
        {
            betNumber = betNumber + 1;
            System.out.println("Current Bet number is: " +betNumber);
            Random random=new Random();
            int random_value=random.nextInt(2);
            if(random_value == 0) {
                stake = stake - bet;
                System.out.println("Bet outcome is: Loss");
            }
            else {
                stake = stake + bet;
                System.out.println("Bet outcome is: Win");
                System.out.println("Stake value is" +stake);
            }
        }
        return stake;
    }
    public static void main(String[] args) {
        System.out.println("welcome to Gambling Simulation Problem");
        System.out.println("Gambler every day stake is " + stake + "and bet is " + bet);
        winLoss();
        resignDay();
    }
}

