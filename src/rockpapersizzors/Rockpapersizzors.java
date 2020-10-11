/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpapersizzors;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author monke
 */
public class Rockpapersizzors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String[] RPS = {"Rock", "Paper","Sizzors"};
      // System.out.println(RPS[1]);
       System.out.println("Type Rock Paper or Sizzors:");
       
       Scanner newScan = new Scanner(System.in);
       String input = newScan.nextLine();
       
       while(!(input.toLowerCase().equals("paper") || input.toLowerCase().equals("rock") || input.toLowerCase().equals("sizzors"))){
           System.out.println("Please enter a valid Choice ");
           input = newScan.nextLine();
           
       }
       String computerRPS = RPS[getRandomInt()];
       System.out.println("You Chose " + input + " The Computer Chose:" + computerRPS);
       
       switch(input.toLowerCase()){
           case "rock":
               if(computerRPS.equals("Rock")){
                   System.out.println("Tie");
               }
               else if(computerRPS.equals("Paper")){
                   System.out.println("You Lost");
                   
               }
               else if(computerRPS.equals("Sizzors")){
                   System.out.println("You Won");
               }
               break;
           case "paper":
                if(computerRPS.equals("Rock")){
                   System.out.println("You Won");
               }
               else if(computerRPS.equals("Paper")){
                   System.out.println("Tie");
                   
               }
               else if(computerRPS.equals("Sizzors")){
                   System.out.println("You Lost");
               }
               break;
           case "sizzors":
                if(computerRPS.equals("Rock")){
                   System.out.println("You Lost");
               }
               else if(computerRPS.equals("Paper")){
                   System.out.println("You Won");
                   
               }
               else if(computerRPS.equals("Sizzors")){
                   System.out.println("Tie");
               }
               break;
    }
    }
    public static int getRandomInt(){
        Random rand = new Random();
        return rand.nextInt(2);
        
    }
    
}
