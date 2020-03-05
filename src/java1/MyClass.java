
package java1;


public class MyClass {
    public static void main(String[] args) throws Exception {
       /*
        String name= "John";
        System.out.println(name);
        int myNum=15;
        System.out.println(myNum);
        System.out.println("Hello "+name+"!");
        String LastName="Doe";
        String FirstName="John";
        String FullName=FirstName+" "+LastName;
        System.out.println(FullName);
        int x=5;
        int y=6;
        System.out.println(x+y);//print the value of x+y
        int a=4,b=5,c=7;
        System.out.println(a+b+c);
        byte myNums=100;
        System.out.println(myNums);
        short yourNum=5000;
        System.out.println(yourNum);
        long yourNums=800000;
        System.out.println(yourNums);
        float herNum=2.45f;
        double herNums=4.89892;
        System.out.println(herNum+herNums);

        String s = "abcd";
        s.indexOf('c');

        int [] f ={3,5,6,2,9,8,1};
        for(int i=f.length-1;i>=0;i--){
            System.out.println(f[i]);
        }

        */
       TEST test = new TEST();
       try {
           test.dog();
       }catch (Exception e) {
           System.out.println(" ");
           //throw e;
       }finally {
           System.out.println("Hello world");
       }



    }
}
