package task3;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class MyFileReaderTest {


    @Test
    public void readUntilComma() {
        MyFileReader fileReader = new MyFileReader(new File("D:/test.txt"));

        String actual = fileReader.readUntilComma();

        assertEquals("some text before comma", actual);
    }

    @Test
    public void readFileWithoutComma() {
        MyFileReader fileReader = new MyFileReader(new File("D:/FileWithoutComma.txt"));

        String actual = fileReader.readUntilComma();

        assertEquals("text without comma", actual);
    }

    @Test
    public void readEmptyFile() {
        MyFileReader fileReader = new MyFileReader(new File("D:/EmptyFile.txt"));

        String actual = fileReader.readUntilComma();

        assertEquals("", actual);
    }

    @Test
    public void fileNotFound() {
        MyFileReader fileReader = new MyFileReader(new File("D:/NotExistedFile.txt"));

        String actual = fileReader.readUntilComma();

        assertEquals("No file", actual);
    }

}