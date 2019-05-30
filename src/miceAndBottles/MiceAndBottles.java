package miceAndBottles;

//there are 100 bottles, only one of them is poison, others are full of water. First, how many mice do you need to tell
// which bottle is poison ? Second, how to do the test ?

//2^7=128>100，2^6=64<100 ,so at least we need 7 mice to do the test.


import java.util.ArrayList;
import java.util.List;

public class MiceAndBottles {
    int n;
    ArrayList<Integer> miceOne = new ArrayList<>();
    ArrayList<Integer> miceTwo = new ArrayList<>();
    ArrayList<Integer> miceThree = new ArrayList<>();
    ArrayList<Integer> miceFour = new ArrayList<>();
    ArrayList<Integer> miceFive = new ArrayList<>();
    ArrayList<Integer> miceSix = new ArrayList<>();
    ArrayList<Integer> miceSeven = new ArrayList<>();

    public void miceDrinkBottle() {
        for (int i = 0b1; i <= Integer.parseInt(Integer.toBinaryString(n)); i++) {
            for (int j = 0; j < 6; j++) {
                int k;
                int h = Integer.parseInt(Integer.toBinaryString(2 ^ j));
                k = h & i;

                if (k != 0) {
                    if (j == 0) {
                        miceOne.add(i);
                    } else if (j == 1) {
                        miceTwo.add(i);
                    } else if (j == 2) {
                        miceThree.add(i);
                    } else if (j == 3) {
                        miceFour.add(i);
                    } else if (j == 4) {
                        miceFive.add(i);
                    } else if (j == 5) {
                        miceSix.add(i);
                    } else {
                        miceSeven.add(i);
                    }

                }
            }
        }
    }


    public void arraylist() {
        ArrayList<ArrayList<Integer>> mice = new ArrayList<ArrayList<Integer>>();
        mice.add(miceOne);
        mice.add(miceTwo);
        mice.add(miceThree);
        mice.add(miceFour);
        mice.add(miceFive);
        mice.add(miceSix);
        mice.add(miceSeven);


        for (int i = 0; i < 6; i++) {
            for (int j : mice.get(i)) {
                System.out.println(j);
            }
        }
    }
}