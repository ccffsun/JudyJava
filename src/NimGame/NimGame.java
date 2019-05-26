package NimGame;
//Nim game
//There are 37 sticks, a player and computer take turns to take the sticks ,they can take 1,2 or 3 sticks once a time
//who take the last stick wins. Now if you are the player and you'll win the game no matter how the computer take the
//sticks, what is the strategy to take the sticks?

import java.util.Random;

public class NimGame {
    private int sticks = 37;
    private int playerTake1 = 3;
    private int playerTake2 = 1;
    String c = "";
    String templateStr="I've take %d . Now there are %d sticks .It's your turn , Mr.Computer.";

    public void thePlayerTake() {
        int n = sticks / 3;
        int m = sticks%3;
        if (n == 1) {
            System.out.println(" YOU KNOW WHAT?! I already know who wins!");
        } else if (n % 2 == 0 && n>2) {
            sticks = sticks - playerTake1;
            c = String.format(templateStr, playerTake1, sticks);
            System.out.println(c);
        } else {
            sticks = sticks - playerTake2;
            c = String.format(templateStr, playerTake2, sticks);
            System.out.println(c);
        }

    }

    public void theComputerTake() {
        Random rand = new Random();
        int t = rand.nextInt(3) + 1;
        sticks = sticks - t;
        c = String.format("OK, I'm the computer , I'll take %d sticks, now there are %d sticks.", t, sticks);
        System.out.println(c);
    }

    public static void main(String[] args) {
        NimGame nim = new NimGame();
        int i = 1;
        String winner="";
        while (nim.sticks > 0) {
            if (i % 2 == 0) {
                nim.theComputerTake();
                winner = "Player";
            } else {
                nim.thePlayerTake();
                winner = "Computer";
            }

            if(nim.sticks<=3){
                System.out.println(String.format("Game over, the %s win the game! ",winner));
                break;
            }

            i++;
        }
    }
}


/*
There are some tips for the game solution:
1. When you use String.format, you should also print the String. That's why you should use String c at the beginning.
2.int n=sticks/3 should be refresh every time when the method thePlayerTake() is called ,otherwise the method will
be called only once when the program run the object casting.
3.thePlayerTake() method has the if statement which tell int stick is the even or odd multiple of 3,if n==0, it'a even
multiple,if n!==0, it's a odd multiple. The strategy to win the game is that the player has to leave odd multiple of 3
sticks to the computer , but here n should greater than 2 ,which means you should leave at least more than 6 sticks to the computer ,
then no matter how many sticks the computer takes, the player wins.
4.The NimGame has a structure of some variables and three methods ,thePlayerTake() ,theComputerTake() and main(),in the
 main method you can't call the variables int sticks until you instance the NimGame class. That's the differences between
 the classes and objects.
 */