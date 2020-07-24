package game;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        PlayWithCards playWithCards = new PlayWithCards();
        int[]a ={1,2,3,4,5,6,7};
        playWithCards.cards = a;
        Scanner scanner = new Scanner(System.in);
        while (true){
            switch (scanner.nextLine()){
                case "1":
                    playWithCards.showCards();
                    break;
                case "2":
                    playWithCards.drawCards();
                    break;
                case "3":
                    playWithCards.epidemic();
                    break;
                case "4":
                    playWithCards.shuffleAll();
                    playWithCards.showCards();
                    break;
            }
        }
    }
}
