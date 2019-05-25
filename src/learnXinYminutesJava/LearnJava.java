package learnXinYminutesJava;
import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.security.*;
import java.util.HashSet;
import  java.util.Scanner;
import java.util.Set;

public class LearnJava {
    public static void main (String[] args){
        System.out.println("Hello World!");
        System.out.println(
                "Integer: "+10+
                "Double: "+3.14+
                "Boolean: "+true);
        System.out.print("Hello ");
        System.out.print("World !");
        System.out.printf("pi=%.5f",Math.PI);

        //use Scanner to read input
        //must import java.util.Scanner;

       /* Scanner scanner=new Scanner(System.in);

        String name=scanner.next();//read String input;
        byte numByte=scanner.nextByte();//read byte input;
        int numInt=scanner.nextInt();//read integer input;
        float numFloat=scanner.nextFloat();//read float input;
        double numDouble=scanner.nextDouble();//read double input;
        boolean bool=scanner.nextBoolean();//read boolean input;
        */
        //////////
        //variables//
        /////////
        int fooInt;//Variable Declaration
        int fooInt1,fooInt2,fooInt3;
        int barInt=1;//Variable Initialization
        int barInt1,barInt2,barInt3;
        barInt1=barInt2=barInt3=1;

        byte fooByte=100;
        int unsignedIntLessThan256=0xff&fooByte;
        int signedInt=(int)fooByte;
        short fooShort=10000;
        int bazInt=1;
        long fooLong=100000L;
        float fooFloat=234.5f;
        double fooDouble=123.4;
        boolean fooBoolean=true;
        boolean barBoolean=false;
        char fooChar='A';
        final int HOURS_T_WORK_PER_WEEK=9001;//final variables can't be reassigned;
        final double E;
        E=2.575;//final variables can be initialized later;

        /*
        BigInteger fooBigInteger=new BigInteger(fooByteArray);
        BigDecimal fooBigDecimal=new BigDecimal(fooBigInteger,fooInt);
        BigDecimal fooBigDecimal=new BigDecimal("0.1");

         */

        String fooString="My String is here!";
        String barString="Printing on a new line\nNo Problem!";//\n start a new line;
        String bazString="Do you want to add a tab?\tNo problem!";
        System.out.println(fooString);
        System.out.println(barString);
        System.out.println(bazString);

        String plusConcatenated="Strings can"+"be concatenated"+"vai+operator";
        System.out.println(plusConcatenated);

        StringBuilder builderConcatenated=new StringBuilder();
        builderConcatenated.append("You");
        builderConcatenated.append("can use");
        builderConcatenated.append("the StringBuilder class.");
        System.out.println(builderConcatenated.toString());//to tie the String pieces together

        StringBuilder stringBuilder=new StringBuilder();
        String inefficientString="";
        for(int i=0;i<10;i++){
            stringBuilder.append(i).append(" ");
            inefficientString+=i+" ";
        }
        System.out.println(inefficientString);
        System.out.println(stringBuilder.toString());

        String.format("%s may prefer %s.","Or you","String.format()");

        ///////////////////
        //Array//
        ///////////////////
        //declare a array, the array size must be decided upon instantiation;
        int[] intArray= new int[10];
        String[] stringArray=new String[1];
        boolean[] boolArray=new boolean[100];

        //declare and initialize an array
        int[] y={9000,1000,1337};
        String names[]={"Bob","John","Fred","Juan Pedro"};
        boolean bools[]={true,false,false};

        //indexing an array- Accessing an element
        System.out.println("intArray @ 0:"+intArray[0]);
        System.out.println("intArray @ 1:"+intArray[1]);


        //////////////
        //Operators///
        //////////////

        System.out.println("\n->Operators");
        int i1=1,i2=2;
        System.out.println("1+2= "+(i1+i2));
        System.out.println("2-1= "+(i2-i1));
        System.out.println("2*1= "+(i2*i1));
        System.out.println("1/2= "+(i1/i2));
        System.out.println("1/2.0= "+(i1/(double)i2));
        System.out.println("11%3= "+(11%3));
        System.out.println("3==2 ? "+(3==2));
        System.out.println("3!=2 ? "+(3!=2));
        System.out.println("3>2 ? "+(3>2));
        System.out.println("3<2 ? "+(3<2));
        System.out.println("2<=2 ? "+(2<=2));
        System.out.println("2>=2 ? "+(2>=2));
        System.out.println("3>2 && 2>3 ? "+((3>2)&&(2>3)));
        System.out.println("3>2 || 2>3 ? "+((3>2)||(2>3)));
        System.out.println("!(3==2) ? "+(!(3==2)));

        int i=0;
        System.out.println("\n->Inc/Dec-rementation");
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(--i);

        //////////////////////
        //Control Structures
        /////////////////////
        System.out.println("\n->Control Structures");

        //If statements are c-like
        int j=10;
        if(j==10){
            System.out.println("I get printed");
        }else if(j>10){
            System.out.println("I don't");
        }else {
            System.out.println("I also don't");
        }

        //While loop
        int fooWhile=0;
        while (fooWhile<100){
            System.out.println(fooWhile);
            //Increment the counter
            //Iterated 100 times,fooWhile 0,1,2,3,....99
            fooWhile++;
        }
        System.out.println("fooWhile Value: "+fooWhile);

        //Do While loop
        int fooDoWhile=0;
        do{
            System.out.println(fooDoWhile);
            //Increment the counter
            //Iterated 99 times ,fooDoWhile 0->99
            fooDoWhile++;
        }while(fooDoWhile<100);
        System.out.println("fooDoWhile Value: "+fooDoWhile);

        //For loop
        int fooFor;
        for(fooFor=0;fooFor<10;fooFor++){
            System.out.println(fooFor);
            //Iterated 10 times, fooFor0->9
        }
        System.out.println("fooFor Value: "+ fooFor);

        //Nested For Loop Exit with Lable
        int u=0;
        int v=0;
        outer:
        for (u=0;u<10;u++){


            for (v=0;v<10;v++){
                if(u==5&&v==5){
                    break outer;
                    //breaks out of outer loop instead of only inner one
                }
            }

        } System.out.println(u+","+v);

        //for Each Loop -Iterate over arrays as well as objects
        int[] fooList ={1,2,3,4,5,6,7,8,9};
        for(int bar:fooList){
            System.out.println(bar);
        }

        int month=3;
        String monthString;
        switch (month){
            case 1:monthString="January";
            break;
            case 2:monthString="February";
            break;
            case 3:monthString="March";
            break;
            default:monthString="Some other month";
            break;
        }
        System.out.println("Swithch Case Result: "+monthString);


        //Try-with-resources
        //the class must implement java.lang.AutoCloseable.
        try(BufferedReader br= new BufferedReader(new FileReader("foo.txt"))){
            System.out.println(br.readLine());
        }catch (Exception ex){
            System.out.println("readLine() failed");
        }

        int foo=5;
        String bar=(foo<10)?"A":"B";
        System.out.println("bar: "+bar);


        ////////////
        //Converting Data Type
        ////////////

        //String to Integer
        Integer.parseInt("123");
        //Integer to String
        Integer.toString(123);
        Double.parseDouble("343.43");
        Double.toString(3.1434);
        Float.toString(3.44f);
        Long.parseLong("2389283");
        Long.toString(48938493);
        System.out.println(String.valueOf('c'));

        ////////////////////////
        //Classes and Functions
        ///////////////////////

        System.out.println("\n->Classes&Functions");

        Bicycle trek=new Bicycle();
        trek.speedUp(3);
        trek.setCadence(100);
        System.out.println("trek info: "+trek.toString());

       /* private static final Set<String> COUNTRIES=new HashSet<String>();
        static {
            COUNTRIES.add("DENMARK");
            COUNTRIES.add("SWEDEN");
            COUNTRIES.add("FINLAND");
        }

        private static final Set<String> COUNTRIES2= new HashSet<String>(){{
            add("DENMARK");
            add("SWEDEN");
            add("FINLAND");
        }}

        */

    }
}
