//https://www.codewars.com/kata/6411b91a5e71b915d237332d/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(validParentheses("()()("));

    }

    public static boolean validParentheses(String parenStr) {
        int count = 0;
        for (char c : parenStr.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}