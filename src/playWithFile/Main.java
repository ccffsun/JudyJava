package playWithFile;

import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        SaveAndLoad sl = new SaveAndLoad();
        while(true){
            System.out.println("Please choose a option: \n(input 1 ,2 ,3 or 4)\n\n1.input \n2.read \n3.quit \n4.clear ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if(s.equals("1")){
                System.out.println("Please input what you want to say:");
                String input = scanner.nextLine();
                sl.saveToFile(input);

            }else if(s.equals("2")) {
                String result = sl.loadFromFile();
                System.out.println(result);
            }else if(s.equals("3")) {
                break;
            }else if(s.equals("4")){
                sl.clearFileData();
            }
            System.out.println();
        }
    }
}
