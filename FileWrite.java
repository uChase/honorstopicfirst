import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileWrite {

    // test
    public static void main(String[] args) {
        FileWrite.writeToFile("hello \n goodbye", "test.txt");
        String str = readFile("test.txt");
        System.out.println(str);
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

    static String readFile(String file) {
        FileReader fr;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String c;
            String sub = "";
            try {
                while (br.ready()) {
                    c = br.readLine();
                    System.out.println(c);
                    sub += c;
                    if (br.ready()) {
                        sub += "\n";
                    }
                }
                br.close();
                fr.close();
                return sub;
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return null;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    static int characterCount(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int count = 0;
        while(br.ready()) {
            br.read();
            count++;
        }
        br.close();
        return count;
    }
}