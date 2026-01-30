// Ваша задача — вернуть таблицу умножения, в number которой каждое число всегда будет целым числом от 1 до 10.
// https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(multiTable(5));
    }

    public static String multiTable(int num) {
      String result = "";
      for (int i = 1; i <= 10; i++){
          result += i + " * " + num + " = " + (i * num) + (i < 10 ? "\n" : "");
      }
      return result;
    }
}




