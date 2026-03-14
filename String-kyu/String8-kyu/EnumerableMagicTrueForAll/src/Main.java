//Задача
//Создайте метод , который принимает два параметра:
//последовательность функция
//Функция возвращает true , если в параметрах она возвращает true для каждого элемента последовательности. В противном случае она должна вернуть false.
// Если последовательность пуста, она должна вернуть true, поскольку технически ни один элемент не провалил проверку.
//https://www.codewars.com/kata/54598d1fcbae2ae05200112c/train/java

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {

        int[] value = {2, 4, 6, 10};
        IntPredicate evenNumber = n -> n % 2 == 0;
        System.out.println(all(value, evenNumber));
    }

    public static boolean all(int[] list, IntPredicate predicate) {
        for (int i : list) {
            if(!predicate.test(i)){
            return false;
            }
        }
        return true;
    }
}