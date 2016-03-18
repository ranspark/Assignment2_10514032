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

public class GuessGame {
    public static void main(String args[])
    {
       Random r = new Random();
       Scanner input=new Scanner(System.in);
       
       int x =1+ r.nextInt(10);
       System.out.println("I am thinking of a number from 1 to 10.");
       System.out.println("Your Guess :");
       int guess =input.nextInt();
       
       if(guess==x)
       {
           System.out.println("Thats right!My Secret Number was "+ x);
                   
       }
       else
       {
           System.out.println("Sorry, But I was thinking of " + x );
       }
       
    }
    
}
