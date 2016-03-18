/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10514032;

/**
 *
 * @author Ampong Ransford
 */
import java.util.Scanner;
import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner input= new Scanner(System.in);
        
        int x = 1 + r.nextInt(5);
        if(x==1)
        {
            System.out.println("Fortune Cookie Says: \" You will find happiness with a new wife\" ");
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50)  );
            System.out.println();
        }
        if(x==2)
        {
            System.out.println("Fortune Cookie Says: \" You will pass your exam\" ");
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50)  );
            System.out.println();
        }
        if(x==3)
        {
            System.out.println("Fortune Cookie Says: \" You will buy a new car this year\" ");
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50)  );
            System.out.println();
        }
        if(x==4)
        {
            System.out.println("Fortune Cookie Says: \" You will become very rich very soon\" ");
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50)  );
            System.out.println();
        }
        if(x==5)
        {
            System.out.println("Fortune Cookie Says: \" You will stay in good health\" ");
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50)  );
            System.out.println();
        }
        if(x==6)
        {
            System.out.println("Fortune Cookie Says: \" Your will never have an accident\" ");
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) +" -"+ "\t" );
            System.out.print( r.nextInt(50) );
            System.out.println();
        }
    }
}
