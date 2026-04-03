//Дана последовательность целых чисел. Ваше решение должно найти наименьшее целое число.
//Например:
//Учитывая [34, 15, 88, 2]ваше решение, вы получите ответ.2
//Учитывая [34, -345, -1, 100]ваше решение, вы получите ответ.-345
//В рамках данного задания можно предположить, что предоставленный массив не будет пустым.
//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(findSmallestInt(new int[]{34, 15, 88, 2}));
    }

    public static int findSmallestInt(int[] args) {
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
           sum = Integer.min(sum,args[i]);
        }
        return sum;
    }
}