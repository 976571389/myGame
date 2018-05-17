/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 * @author Administrator
 */
public class game {
    /**
     * This is a log object.
     */
     private static Logger logger = LoggerFactory.getLogger(game.class);
    
     /**
      * This is the main class.
      * @param args 
      * 
      */
   public static void main(String[] args) {
       
        String stones="     0    0    0    0    0    0    0    0    0    0    0    0    0    0    0\n     1    2    3    4    5    6    7    8    9    10   11   12   13   14   15";
        System.out.println(stones); 
        logger.info("Starting the game...");
         Scanner in= new Scanner(System.in);
        StringBuilder strBuilder = new StringBuilder(stones);
            int i=15;
            System.out.println("name of player1...");
            String player1=in.nextLine();
            System.out.println("name of player2...");
            String player2=in.nextLine();
            String player=player1;
            while(i!=0){
                System.out.println("It is " + player+"'s turn");
                int number;
                int index = 0;
              System.out.println("How many stone do you want to remove?1 or 2");
                number=in.nextInt();
                switch(number){
                    case 1:index=1;
                        break;
                    case 2:index=2;
                        break;
                    default:System.out.println("Please give a number 1 or 2....");
                     break; }
             if(index==1){
              int stoneNum1;
                System.out.println("which stone do you want to remove?"); 
                  stoneNum1=in.nextInt();
                
                 while(!(stoneNum1<15&&stoneNum1>0&&(!stones.substring(stoneNum1*5, stoneNum1*5+1).equals("-")))){
                      System.out.println("Wrong box number,please give another one..."); 
                        logger.warn("The wrong box number...");
                      stoneNum1=in.nextInt();
                    }
                  strBuilder.setCharAt(stoneNum1*5, '-');
                      stones=strBuilder.toString();
                      i--; 
                     System.out.println(stones);
                     if(player==player1){
                  player=player2;
              }else{
                  player=player1;
              }
                }
              if(index==2){
                  int stoneNum1;
                  int stoneNum2;
                  System.out.println("which stone do you want to remove?"); 
                  stoneNum1=in.nextInt();
                 while(!(stoneNum1<15&&stoneNum1>0&&(!stones.substring(stoneNum1*5, stoneNum1*5+1).equals("-")))){
                      System.out.println("Wrong box number,please give another one..."); 
                      logger.warn("The wrong box number...");
                      stoneNum1=in.nextInt();
                    }
                  strBuilder.setCharAt(stoneNum1*5, '-');
                      stones=strBuilder.toString();
                      i--; 
                     System.out.println(stones);
                   System.out.println("which stone do you want to remove"); 
                      stoneNum2=in.nextInt();
                      while(!(stoneNum2<15&&stoneNum2>0&&(!stones.substring(stoneNum2*5, stoneNum2*5+1).equals("-"))&&(stoneNum2==stoneNum1+1||stoneNum2==stoneNum1-1))){
                          System.out.println("Wrong box number,please give another one..."); 
                          logger.warn("The wrong box number...");
                        stoneNum2=in.nextInt();
                       }
                       strBuilder.setCharAt(stoneNum1*5, '-');
                      stones=strBuilder.toString();
                      i--; 
                    System.out.println(stones); 
                     if(player==player1){
                  player=player2;
              }else{
                  player=player1;
              }
                   }
             
              }
          
        }
    }
    

