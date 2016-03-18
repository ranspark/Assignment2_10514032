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

public class Collatz {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Starting Number : ");
        int number;
        number=input.nextInt();
        while(number!=1)
        {
            System.out.println(number);
            if(number%2==0)
            {
              number=number/2;
              
            }
            else
                number=((3*number)+1);
            
        }
        
        
        
        
    }
    
}
