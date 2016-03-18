/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author randy
 */
import javax.swing.JOptionPane;

public class AdventureGame {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"WELCOME TO MTCHELLE'S TINY ADVENTURE!","CHOOSE YOUR OWN ADVENTURE",JOptionPane.PLAIN_MESSAGE);
        String adventure=JOptionPane.showInputDialog("You are in a creepy house! \t Would you like to go 'upstairs' or into the 'kitchen'? ");
        //for kitchen after creepy house
         if("kitchen".equals(adventure))
         {
             String kitchen=JOptionPane.showInputDialog("There is a long counter with dirty dishes everywhere. Off to one side\n" +
                     "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
             if("refrigerator".equals(kitchen))
             {
                 String refrigerator=JOptionPane.showInputDialog("Would you like to eat some of the food? (\"yes\" or \"no\")" +
                         " Inside the refrigerator you see food and stuff. It looks pretty nasty.\n");
                 if("no".equals(refrigerator))
                 {
                     JOptionPane.showMessageDialog(null,"You die of starvation... eventually.");
                 }
             }
             
             
         }
         else if("upstairs".equals(adventure))
         {
             String upstairs=JOptionPane.showInputDialog("Upstairs you see a hallway. At the end of the hallway is the master\n" +
                "\"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like\n" +
                "to go?"); 
             if("bedroom".equalsIgnoreCase(upstairs))
             {
                 String bedroom=JOptionPane.showInputDialog("You are in a plush bedroom, with expensive‐looking hardwood furniture. The\n" +
                    "bed is unmade. In the back of the room, the closet door is ajar. Would you\n" +
                    "like to open the door? (\"yes\" or \"no\")");
                 
                 if("no".equalsIgnoreCase(bedroom))
                 {
                     JOptionPane.showMessageDialog(null,"Well, then I guess you'll never know what was in there. Thanks for playing,\n" +
                        "I'm tired of making nested if statements.\n","ADVENTURE OVER",JOptionPane.PLAIN_MESSAGE);
                 }
             }
         }
    }
    
}
