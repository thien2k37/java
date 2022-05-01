package TextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Exercise {
    public static void main(String[] args) {
        Student s = new Student("thien", 22, 8.5);

        try {
            FileWriter fw = new FileWriter("data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s.toString());
            bw.close();
            fw.close();
        }catch (Exception e) {

        }
    }
}
