//Возьмите целое число n (n >= 0)и цифру, d (0 <= d <= 9)которая будет считаться целым числом.
//Возведите в квадрат все числа k (0 <= k <= n)от 0 до n.
//Подсчитайте количество цифр, dиспользованных при написании всех символов k**2.
//Реализуйте функцию, которая принимает nв dкачестве параметров и возвращает это значение.
//https://www.codewars.com/kata/566fc12495810954b1000030/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(nbDig(25, 1));
    }

    public static int nbDig(int n, int d) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            long square = i * i;

            if (square == 0 && d == 0) {
                count++;
            }
            while (square > 0) {
                if (square % 10 == d) {
                    count++;
                }
                square /= 10;

            }
        }
        return count;

    }
}
