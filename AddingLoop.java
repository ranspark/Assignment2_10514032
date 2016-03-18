/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
package assignment2_10514032;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class AddingLoop {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Numbers Besides 0 and I will sum them up");
        System.out.println("Lets Go :");
        int numbers=input.nextInt();
        int total=0;
        while(numbers!=0)
        {
            total=total+numbers;
            System.out.println("So far the total is "+ total);
             System.out.println("Number :");
             numbers=input.nextInt();
        }
        System.out.println("The total is "+ total);
    }
}
