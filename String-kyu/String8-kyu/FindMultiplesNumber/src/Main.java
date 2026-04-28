//В этом простом упражнении вы напишете функцию, которая принимает два целых числа: nи limit, и возвращает список чисел, кратных этому числу, n вплоть до и, возможно, включая limit.
//Гарантируется, что n > 0и limit >= n.
//Например, если переданы параметры (2, 6), функция должна вернуть [2, 4, 6], 2, 4и 6являются кратными числам 2до 6.
//https://www.codewars.com/kata/58ca658cc0d6401f2700045f/train/java
public class Main {
    public static void main(String[] args) {


        int[] result = find(5, 25);
        for (int s : result) {
            System.out.println(s);
        }
    }

    public static int[] find(int base, int limit) {
        int count = 0;
        int[] result = new int[limit / base];
        for (int i = base; i <= limit; i += base) {
            result[count] = i;
            count++;
        }
        return result;
    }
}