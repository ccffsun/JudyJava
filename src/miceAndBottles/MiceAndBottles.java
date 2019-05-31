package miceAndBottles;

//there are 100 bottles, only one of them is poison, others are full of water. First, how many mice do you need to tell
// which bottle is poison ? Second, how to do the test ?

//2^7=128>100，2^6=64<100 ,so at least we need 7 mice to do the test.


import java.util.ArrayList;
import java.util.List;

public class MiceAndBottles {
    //定义有n瓶药水
    int n = 100;
    //定义每只老鼠药吃的药水的集合
    ArrayList<Integer> miceOne = new ArrayList<>();
    ArrayList<Integer> miceTwo = new ArrayList<>();
    ArrayList<Integer> miceThree = new ArrayList<>();
    ArrayList<Integer> miceFour = new ArrayList<>();
    ArrayList<Integer> miceFive = new ArrayList<>();
    ArrayList<Integer> miceSix = new ArrayList<>();
    ArrayList<Integer> miceSeven = new ArrayList<>();

    //判断二进制的&操作，除去其他位数看是否为1，如果是1，老鼠需要吃这瓶药水，每瓶药水归到每只老鼠的名下
    public void miceDrinkBottle() {
        for (int j = 0; j < 7; j++) { //1-100 binary
            for (int i = 1; i <= n; i++) {
                int h = (int) Math.pow(2, j);
                int k = h & i;
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
    //方便打印的method 把老鼠集合后让printOut()循环打印
    public void printOut() {
        ArrayList<ArrayList<Integer>> mice = new ArrayList<ArrayList<Integer>>();
        mice.add(miceOne);
        mice.add(miceTwo);
        mice.add(miceThree);
        mice.add(miceFour);
        mice.add(miceFive);
        mice.add(miceSix);
        mice.add(miceSeven);

        //循环打印并帮老鼠编号
        System.out.println("Mice i drink the drops from [....] bottles :");
        int i = 1;
        for (ArrayList<Integer> u : mice) {

            System.out.println("Mice" + i + ":" + u);
            i++;
        }
    }
}

//1. math.power(x,y) VS x^y
//2. for(i=0;i<n;i++){
//      for(j=0;j<m;j++){
//       if(i=0){
//         System.out.println(j);
//        }
//    注意for循环嵌套的顺序
//3.ArrayList 是一个class 不可以定义是直接添加元素
//4.ArrayList内可以嵌套ArrayList
//5.最后i的循环

