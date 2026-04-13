import java.util.Iterator;
import java.util.TreeSet;

//Задача
//Дан массив/список целых чисел. Необходимо найти максимальную сумму 3уникальных элементов массива.
//Примечания :
//Размер массива должен быть не менее 3 .
//Элементы массива могут быть равны нулю или иметь отрицательное значение.
//В массиве/списке могут встречаться повторяющиеся числа, поэтому (дубликаты не учитываются при суммировании) .
//https://www.codewars.com/kata/5aa1bcda373c2eb596000112/train/java
public class Main {
    public static void main(String[] args) {
        int [] array = new int[]{3, 2, 6, 8, 2, 3};
        System.out.println(maxTriSum(array));

    }

    public static int maxTriSum(int[] numbers) {
        TreeSet<Integer> number = new TreeSet<>((s1, s2) -> -Integer.compare(s1, s2));
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            number.add(numbers[i]);
        }
        Iterator<Integer> interator = number.iterator();
        while (interator.hasNext() && count < 3) {
            sum += interator.next();
            count++;

        }
        return sum;
    }
}