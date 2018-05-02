package task3;

import java.io.*;

public class MyFileReader {
    private File file;

    public MyFileReader(File file) {
        this.file = file;
    }

    public String readUntilComma() {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(file)) {
            char current;
            while (fis.available() > 0) {
                current = (char) fis.read();

                if (isComma(current)) {
                    break;
                } else {
                    sb.append(current);
                }
            }
        } catch (FileNotFoundException e) {
            return "No file";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private boolean isComma(char current) {
        return current == ',';
    }
}
