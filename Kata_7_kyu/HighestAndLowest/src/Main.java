//В этом небольшом задании вам дана последовательность чисел, разделенных пробелами, и вы должны найти наибольшее и наименьшее из них.
//Примечания
//Все числа действительны Int32, подтверждать их не нужно.
//Во входной строке всегда будет как минимум одно число.
//Выходная строка должна состоять из двух чисел, разделенных одним пробелом, причем наибольшее число должно быть первым.
//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
public class Main {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3"));

    }

    public static String highAndLow(String numbers) {
        String[] number = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String s : number) {
            int value = Integer.parseInt(s);
            max = Math.max(max, value);
            min = Math.min(min, value);
        }
        return max + " " + min;
    }
}