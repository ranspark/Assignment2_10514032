/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10514032;

/**
 *
 * @author Ransford Ampong
 * 
 */
import java.util.Scanner;
import java.util.Random;
public class ThreeCardMonte {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Random r = new Random();
        
        int x = 1+r.nextInt(2);
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards");
        System.out.println();
        System.out.println("Which one is the ace :");
        System.out.println( "##"+ "\t"+" ##" +"\t" +"##" );
        System.out.println( "##"+ "\t"+" ##" +"\t" +"##" );
          System.out.println( "1"+ "\t"+" 2" +"\t" +"3" );
          
          int guess=input.nextInt();
          if(guess==1 && x==1)
          {
              System.out.println("You nailed it, Fast Eddie reluctantly hands you your money");
              
        System.out.println( "AA"+ "\t"+" ##" +"\t" +"##" );
        System.out.println( "AA"+ "\t"+" ##" +"\t" +"##" );
          System.out.println( "1"+ "\t"+" 2" +"\t" +"3" );
          }
          else if(guess==2 && x==2)
          {
              System.out.println("You nailed it, Fast Eddie reluctantly hands you your money");
              
        System.out.println( "##"+ "\t"+" AA" +"\t" +"##" );
        System.out.println( "##"+ "\t"+" AA" +"\t" +"##" );
          System.out.println( "1"+ "\t"+" 2" +"\t" +"3" );
          }
       else if(guess==3 && x==3)
          {
              System.out.println("You nailed it, Fast Eddie reluctantly hands you your money");
          
        System.out.println( "##"+ "\t"+" ##" +"\t" +"AA" );
        System.out.println( "##"+ "\t"+" ##" +"\t" +"AA" );
          System.out.println( "1"+ "\t"+" 2" +"\t" +"3" );
          }
          
       else if(guess==1 && x==1)
       {
           System.out.println("Ha! Fast Eddy Wins Again! The ace was card number 3");
           System.out.println( "##"+ "\t"+" ##" +"\t" +"AA" );
        System.out.println( "##"+ "\t"+" ##" +"\t" +"AA" );
          System.out.println( "1"+ "\t"+" 2" +"\t" +"3" );
       }
          
          else if(guess==1 && x==2)
       {
           System.out.println("Ha! Fast Eddy Wins Again! The ace was card number 2");
            System.out.println( "##"+ "\t"+" AA" +"\t" +"##" );
        System.out.println( "##"+ "\t"+" AA" +"\t" +"##" );
          System.out.println( "1"+ "\t"+" 2" +"\t" +"3" );
       }
          
          else if(guess==1 && x==3)
       {
           System.out.println("Ha! Fast Eddy Wins Again! The ace was card number 3");
             System.out.println( "##"+ "\t"+" ##" +"\t" +"AA" );
        System.out.println( "##"+ "\t"+" ##" +"\t" +"AA" );
          System.out.println( "1"+ "\t"+" 2" +"\t" +"3" );
    }
    
}
}
