package diceRoll;

import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           while(true){//While loop to read the user's input
               String val = br.readLine();
               if(val.trim().equals("")){
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
