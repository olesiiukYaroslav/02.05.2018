package task2;

public class Calc {

    public int add(int first, int second) {

        while (second != 0) {
            int carry = first & second;

            first = first ^ second;

            second = carry << 1;
        }

        return first;
    }
}
