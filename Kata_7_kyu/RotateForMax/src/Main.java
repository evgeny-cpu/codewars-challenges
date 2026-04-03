//Начнём с примера:
//Возьмите число: 56789. Поверните влево, получите 67895.
//Оставьте первую цифру на месте, а остальные цифры поверните влево: 68957.
//Оставьте первые две цифры на месте, а остальные поверните: 68579.
//Сохраните первые три цифры и поверните остальные влево: 68597. Теперь все готово, поскольку, сохранив первые четыре, остается только одна цифра, которая, повернувшись, становится самой собой.
//У вас есть следующая последовательность чисел:
//56789 -> 67895 -> 68957 -> 68579 -> 68597
//и вы должны вернуть наибольшую сумму: 68957.
//https://www.codewars.com/kata/56a4872cbb65f3a610000026/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(maxRot(38458215));
    }

    public static long maxRot(long n) {
        String number = Long.toString(n);
        long max = n;

        for (int i = 0; i < number.length() - 1; i++) {
            String s1 = number.substring(0, i);
            String s2 = number.substring(i);
            number = s1 + s2.substring(1) + s2.charAt(0);
            long value = Long.parseLong(number);
            if (value > max) {
                max = value;
            }
        }
        return max;

    }
}