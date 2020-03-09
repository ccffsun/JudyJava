package playWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveAndLoad {
    private static String filePath ="/Users/ccffsun/IdeaProjects/JudyJava/src/playWithFile/InputData";
    public void saveToFile (String s)  {
        try {
            FileWriter fw = new FileWriter(filePath,true);
            fw.write(s+"\n");
            fw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String loadFromFile() {
        String result = "";
        try {
            File myFile = new File(filePath);
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String c = sc.nextLine();
                result += c+"\n";
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
