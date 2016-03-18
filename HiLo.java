/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10514032;

/**
 *
 * @author Ampong Ransford
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class HiLo {
    public static void main(String[] args)
    {
        Random r= new Random();
        Scanner input=new Scanner(System.in);
        
        int x=1+r.nextInt(99);
        System.out.println("I am thinking of a number between 1 and 100.  Try to Guess it :");
        int guess=input.nextInt();
        if(guess<x)
        {
            System.out.println("Your guess is too low,I was thinking of "+ x);
            
        }
        else if(guess>x)
        {
            System.out.println("Your guess is too high, I was thinking of "+ x);
            
        }
        else if(guess==x)
        {
            System.out.println("You guessed it! What are the odds!");
        }
                 
    }
}
