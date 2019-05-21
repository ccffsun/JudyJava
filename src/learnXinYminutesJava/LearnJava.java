package learnXinYminutesJava;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.security.*;
import  java.util.Scanner;

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

        Scanner scanner=new Scanner(System.in);

        String name=scanner.next();//read String input;
        byte numByte=scanner.nextByte();//read byte input;
        int numInt=scanner.nextInt();//read integer input;
        float numFloat=scanner.nextFloat();//read float input;
        double numDouble=scanner.nextDouble();//read double input;
        boolean bool=scanner.nextBoolean();//read boolean input;

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




    }
}
