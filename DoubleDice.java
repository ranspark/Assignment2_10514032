/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10514032;

import java.util.Random;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class DoubleDice {
    public static void main(String[] args)
    {
        Random r =new Random();
        int x= 1+ r.nextInt(5);
        int y=1+ r.nextInt(5);
        while(x!=y){
        System.out.println("Roll #1: "+ x);
        System.out.println("Roll #2: "+ y);
        System.out.println("The total is "+ (x+y) +"!");
        x= 1+ r.nextInt(5);
        y=1+ r.nextInt(5);
        }
        System.out.println("Roll #1: "+ x);
        System.out.println("Roll #2: "+ y);
        System.out.println("The total is "+ (x+y) +"!");
    }
    
    
}
