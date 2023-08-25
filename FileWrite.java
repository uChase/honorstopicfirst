import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileWrite {

    public static void main(String[] args) {
        FileWrite.writeToFile("hello \n goodbye", "test");
        readFile("output.txt");
    }

    static void writeToFile(String text, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter b = new BufferedWriter(fileWriter);
            b.write(text);
            b.close();
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    static void readFile(String file) {
        FileReader fr;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String c;
            try {
                while (br.ready()) {
                    c = br.readLine();
                    System.out.println(c);
                }
                br.close();
                fr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}