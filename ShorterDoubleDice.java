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
import java.util.Random;
public class ShorterDoubleDice {
    
 public static void main(String[] args)
    {
        Random r =new Random();
        int x,y;
        do{
             x= 1+ r.nextInt(5);
         y=1+ r.nextInt(5);
        System.out.println("Roll #1: "+ x);
        System.out.println("Roll #2: "+ y);
        System.out.println("The total is "+ (x+y) +"!");
        }
        while(x!=y);
        {
         System.out.println("Roll #1: "+ x);
        System.out.println("Roll #2: "+ y);
        System.out.println("The total is "+ (x+y) +"!");
        x= 1+ r.nextInt(5);
        y=1+ r.nextInt(5);
        
        }
    }
}
 
    


        
    


