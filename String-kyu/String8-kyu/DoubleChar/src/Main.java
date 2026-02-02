//Получив строку, необходимо вернуть строку, в которой каждый символ (с учетом регистра) повторяется один раз.
//https://www.codewars.com/kata/56b1f01c247c01db92000076/train/java

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleChar("hello"));


    }

    public static String doubleChar(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i);
            result += s.charAt(i);

        }
        return result;
    }
}
