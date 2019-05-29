package diceRoll;

import java.awt.datatransfer.StringSelection;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class DiceRoll {

    public void start(){
        System.out.println("Welcome! Here you have two dice rolling a time, are you ready for rolling the dice? \n Please press \"Enter\" to begin the game.");
    }

    //two dice


    public void end(){
        Random ran=new Random();
        int FirstDice =ran.nextInt(6)+1;
        int SecondDice =ran.nextInt(6)+1;
        String e=String.format("Good job! The number is %d and %d, thank you for your time!",FirstDice,SecondDice);
        System.out.println(e);
    }

    public static void main(String[] args){
        try{
           DiceRoll rollTheDice=new DiceRoll();
           rollTheDice.start();
           while(true){//While loop to read the user's input
               char val =(char)System.in.read();//System.in.read的应用
               if(val==10){
                   rollTheDice.end();
                   System.exit(0);
               }
               else{
                   System.out.println("Please press the \"Enter\"!");
               }

           }
        }catch (IOException e) {
            e.printStackTrace();//catch的IOException 应用
        }


    }
}
