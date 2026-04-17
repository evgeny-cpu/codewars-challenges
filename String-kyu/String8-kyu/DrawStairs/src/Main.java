//Дано число n. Нарисуйте лестницу,
//используя букву [число] "I", nвысотой и nшириной [число], причем самая высокая лестница должна находиться в верхнем левом углу.
//https://www.codewars.com/kata/5b4e779c578c6a898e0005c5/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(draw(3));
    }

    public static String draw(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                result.append(" ");
            }
            result.append("I").append(i < n -1 ? "\n" : "");
        }
        return result.toString();
    }
}