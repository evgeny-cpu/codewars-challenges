//https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/java
public class Main {
    public static void main(String[] args) {

        int numbers = find(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(numbers);

    }

    static Integer find(final int[] array) {
        if (array == null || array.length < 2) return null;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                return array[i + 1];
            }
        }
        return null;
    }

}