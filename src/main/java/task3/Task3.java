package task3;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("D:/test.txt");

        MyFileReader fileReader = new MyFileReader(file);

        String result = fileReader.readUntilComma();

        System.out.println(result);
    }
}
