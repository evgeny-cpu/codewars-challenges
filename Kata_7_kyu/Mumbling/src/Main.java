//На этот раз без сюжета и теории. Примеры ниже показывают, как писать функции accum:
//https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(accum("AbC"));
    }


    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            result.append(s.toUpperCase().charAt(i)).repeat(s.toLowerCase().charAt(i), i).append(i < s.length() - 1 ? "-" : "");

        }
        return result.toString();
    }
}