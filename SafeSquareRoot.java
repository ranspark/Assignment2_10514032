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
public class SafeSquareRoot {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    int number = 1;
    
    double squareroot;
    while(number >0)
    { System.out.println("SQUARE ROOT! ");
    System.out.println("Enter a number: ");
    number=input.nextInt();
    squareroot=Math.sqrt(number);
    System.out.println("The Square root of "+number +" is "+squareroot);
    }
    System.out.print("You cant Take the Square Root of a Negative number Silly!");
    }
}

    
    
    
    
        

    








    
    

