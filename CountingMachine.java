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
public class CountingMachine {
    public static void main(String[] args)
    {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Count to :");
        num=input.nextInt();
        for(int i=0;i<=num;i++)
        {
            System.out.println(i);
        }
        
    }
    
}
