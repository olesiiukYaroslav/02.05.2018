package task2;

import org.junit.Assert;
import org.junit.Test;


public class CalcTest {
    private Calc calc = new Calc();

    @Test
    public void addFirstZero() {
        int actual = calc.add(10, 0);

        Assert.assertEquals(10, actual);
    }

    @Test
    public void addOnBorder() {
        int actual = calc.add(256, 256);

        Assert.assertEquals(512, actual);
    }

    @Test
    public void addTwoZeros() {
        int actual = calc.add(0, 0);

        Assert.assertEquals(0, actual);
    }
}