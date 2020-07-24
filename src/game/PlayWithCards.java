package game;

import java.util.Random;

public class PlayWithCards {
    int[] cards;
    int s = 0;

    private void shuffledCards(int h, int t) {
        if(h<0 ||t>=cards.length) {
            System.out.println("ooxxx");
            return;
        }

        for(int i = 0;i<t-h;i++){
            int max = t;
            int min = h+i;
            Random random =  new Random();
            int swap = random.nextInt(max - min+1)+min;
            int temp = cards[min];
            cards[min] = cards[swap];
            cards[swap]= temp;
        }
    }

    public void showCards(){
        for(int i =0; i<cards.length-s;i++){
            System.out.print(cards[i+s]+" ");
        }
        System.out.println();
    }

    public void drawCards(){
        if(s<cards.length) {
            System.out.println(cards[s]);
            s = s + 1;
        }
        else {
            System.out.println("sorry, there's no card");
        }
    }

    public void epidemic() {
        shuffledCards(0,s-1);
        s = 0;
        showCards();
    }

    public void shuffleAll(){
        shuffledCards(0, cards.length-1);
    }
}
