package demo;

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
    }
}
