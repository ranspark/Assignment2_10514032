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
public class KeepGuessing {
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner input=new Scanner(System.in);
        int x = 1+ r.nextInt(10);
        System.out.println("I am thinking of a  number for 1 to 10,try to guess it :");
        int guess=input.nextInt();
        while(guess!=x)
        {
            System.out.println("That is incorrect ");
            System.out.println("Guess Again :");
                    guess=input.nextInt();
        }
        
        System.out.println("Thats right you are a good guesser");
    }
}
