package demo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String s = String.format("Pi is%5.2f%%", 3.14);
        System.out.println("\n\\\"\"\\");// escape character \\->\, \"->" ,\'->';
        /*
        \t Insert a tab in the text at this point.
        \b Insert a backspace in the text at this point.
        \n Insert a newline in the text at this point.
        \r Insert a carriage return in the text at this point.
        \f Insert a form feed in the text at this point.
        \' Insert a single quote character in the text at this point.
        \" Insert a double quote character in the text at this point.
        \\ Insert a backslash character in the text at this point.

        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();

         */
        byte b = 100;
        int result = b & 0xff;
        System.out.println(result);
        System.out.println((byte) 0xff);
        System.out.println((byte) 0b10000110);


        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if(i==j){
                    continue;
                }
                if(j%2==0){
                    continue;
                }
                if(j>=5){
                    break;
                }
                int k = i * j;
                System.out.println(i + "*" + j + "=" + k);
            }
        }

        //Challenge solution
        //Fizz Buzz Solution
        for(int i=1;i<=100;i++){
            if(i%3==0 &&i%5==0 ){
                System.out.print("Fizz!Buzz! ");
            }
            else if(i%3==0){
                System.out.print("Fizz! ");
            }
            else if(i%5==0){
                System.out.print("Buzz! ");
            }
            else{
                System.out.print(i+" ");
            }
        }
        System.out.println();

        Scanner inputN =new Scanner(System.in);
        int n=inputN.nextInt();
        int [] abc=new int[n];
        System.out.println(abc.length);
        System.out.println(abc[abc.length-1]);
        String [] str=new String[n];
        str[str.length-1]="Hello";
        System.out.println(str[str.length-1]);
        boolean [] boo=new boolean[n];
        System.out.println(boo[boo.length-1]);
        double [] dou=new double[n];
        System.out.println(dou[dou.length-1]);

        List<String> l = new ArrayList<String>();

    }

    public List<String> fizzBuzz(int n) {

        // ans list
        List<String> ans = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisibleBy3 && divisibleBy5) {
                // Divides by both 3 and 5, add FizzBuzz
                ans.add("FizzBuzz");
            } else if (divisibleBy3) {
                // Divides by 3, add Fizz
                ans.add("Fizz");
            } else if (divisibleBy5) {
                // Divides by 5, add Buzz
                ans.add("Buzz");
            } else {
                // Not divisible by 3 or 5, add the number
                ans.add(Integer.toString(num));
            }
        }

        return ans;
    }
}
