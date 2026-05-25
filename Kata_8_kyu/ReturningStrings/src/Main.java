//Создайте функцию, которая принимает параметр, представляющий собой значение a, name и возвращает сообщение: "Hello, <name> how are you doing today?".
//https://www.codewars.com/kata/55a70521798b14d4750000a4/train/java

public class Main {
    public static void main(String[] args) {
        System.out.println(greet("Смит"));

    }

    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }
}