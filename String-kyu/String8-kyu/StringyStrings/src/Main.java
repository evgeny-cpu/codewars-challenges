//Напишите мне функцию stringy, которая принимает a size и возвращает a, string состоящий из чередующихся 1s и 0s.
//Строка должна начинаться с точки 1.
//Строка, содержащая size6 символов, должна вернуть : '101010'.
//При size значении 4 должно вернуться: '1010'.
//При значении size12 должно вернуться: '101010101010'.
//Размер всегда будет положительным и будет состоять только из целых чисел.
//https://www.codewars.com/kata/563b74ddd19a3ad462000054/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(stringy(12));
    }

    public static String stringy(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            builder.append(i % 2 == 0 ? "0" : "1");
        }
        return builder.toString();
    }
}