package task1;

public class StringHandler {


    public String reverseString(String line) {
        StringBuilder sb = new StringBuilder();

        for (int i = line.length() - 1; i >= 0; i--) {
            sb.append(line.charAt(i));
        }

        return sb.toString();
    }
}
