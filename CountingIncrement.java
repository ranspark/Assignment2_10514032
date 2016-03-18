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
public class CountingIncrement {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Count from: ");
        a=input.nextInt();
        System.out.println("Count to :");
                b=input.nextInt();
                System.out.println("Count by :");
                        c=input.nextInt();
                        for (int i=a;i<b;i=i+c)
                        {
                            System.out.println(i);
                            
                            
                        }
                            
        
    }
}
