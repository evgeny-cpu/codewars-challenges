//Создайте функцию, которая выдает персонализированное приветствие. Эта функция принимает два параметра: name и owner.
//Используйте условные операторы для возврата нужного сообщения:
//https://www.codewars.com/kata/5772da22b89313a4d50012f7/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(greet("Greg", "Daniel"));
    }

    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}