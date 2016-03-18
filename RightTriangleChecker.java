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
public class RightTriangleChecker {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int side1,side2,side3;
       
        System.out.println("Enter Three Integers :");
        System.out.println("Side 1: ");
        side1=input.nextInt();
        System.out.println("Side 2: ");
        side2=input.nextInt();
        while(side1 > side2)
        {
            System.out.println(side2+" is smaller than "+side1 +" . Try Again");
            side2=input.nextInt();
         }
     System.out.println("Enter Side 3 :");
     side3=input.nextInt();
     if(side2>side3){
     System.out.println("Your Three Sides are "+ side1+" " +side2+" " +side3);
     System.out.println("Yes These sides do make a right triangle. YIppy Skippy!");
         
}
     else
     {
         System.out.println("Your Three Sides are "+ side1+" " +side2+" " +side3);
     System.out.println("No these sides do not make a triangle");
     }
         
     }
}

