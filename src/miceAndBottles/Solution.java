package miceAndBottles;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void solve() {
        int[] masks = {
                0b1000000,
                0b0100000,
                0b0010000,
                0b0001000,
                0b0000100,
                0b0000010,
                0b0000001
        };

        List<Integer> bottles1 = new ArrayList<Integer>();
        List<Integer> bottles2 = new ArrayList<Integer>();
        List<Integer> bottles3 = new ArrayList<Integer>();
        List<Integer> bottles4 = new ArrayList<Integer>();
        List<Integer> bottles5 = new ArrayList<Integer>();
        List<Integer> bottles6 = new ArrayList<Integer>();
        List<Integer> bottles7 = new ArrayList<Integer>();

        for(int i = 0; i<=100; i++){
            if ((i&masks[0])!=0){
                bottles1.add(i);
            }
            if ((i&masks[1])!=0){
                bottles2.add(i);
            }
            if ((i&masks[2])!=0){
                bottles3.add(i);
            }
            if ((i&masks[3])!=0){
                bottles4.add(i);
            }
            if ((i&masks[4])!=0){
                bottles5.add(i);
            }
            if ((i&masks[5])!=0){
                bottles6.add(i);
            }
            if ((i&masks[6])!=0){
                bottles7.add(i);
            }
        }

        System.out.print("Bottles 1:");
        System.out.println(bottles1);
        System.out.print("Bottles 2:");
        System.out.println(bottles2);
        System.out.print("Bottles 3:");
        System.out.println(bottles3);
        System.out.print("Bottles 4:");
        System.out.println(bottles4);
        System.out.print("Bottles 5:");
        System.out.println(bottles5);
        System.out.print("Bottles 6:");
        System.out.println(bottles6);
        System.out.print("Bottles 7:");
        System.out.println(bottles7);

    }
}
