/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10514032;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import java.util.Random;
public class HiLoLimitied {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Random r = new Random();
        int tries=1;
        int x=1+r.nextInt(99);
        int guess;
        System.out.println("I am thinking of a number between 1 -100 .You have 7 guesses :");
                System.out.println("First guess: ");
                guess=input.nextInt();
                while(guess!=x && tries<=7)
                {
                    if(guess < x)
                    {
                        System.out.println("Sorry you are too low");
                        System.out.println("Guess # "+ tries);
                        guess=input.nextInt();  
                        tries=tries+1;
                    }
                   else if(guess > x)
                    {
                        System.out.println("Sorry you are too high");
                        System.out.println("Guess # "+ tries);
                        guess=input.nextInt();
                        tries=tries+1;
                    }
                  else  if(guess == x)
                    {
                        System.out.println("You Guessed it what are the odds!");
                        System.out.println("Guess # "+ tries);
                        guess=input.nextInt();
                        tries=tries+1;
                    }
                  if(x!=guess && tries >7)
                  {
                      System.out.println("Sorry you didnt guess it in 7 tries.You lose");
                  }
                }
    }
    
    
}
