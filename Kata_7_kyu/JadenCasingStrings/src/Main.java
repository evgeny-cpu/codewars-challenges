//https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;

        String[] result = phrase.split(" ");
        for (int i =0; i < result.length ; i++){
            result[i] = result[i].substring(0,1).toUpperCase() + result[i].substring(1);
        }
        return String.join(" ",result);
    }

}