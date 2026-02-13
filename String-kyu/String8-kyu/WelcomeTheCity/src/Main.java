//Создайте метод, который принимает на вход имя, город и штат для приветствия человека. Обратите внимание, что name это будет массив,
// состоящий из одного или нескольких значений, которые должны быть соединены между собой одним пробелом, а длина массива name в тестовых случаях будет варьироваться.
//https://www.codewars.com/kata/5302d846be2a9189af0001e4/train/java

public class Main {
    public static void main(String[] args) {

        String[] name = {"John", "Smith"};
        System.out.println(sayHello(name, "Phoenix", "Arizona"));

    }

    public static String sayHello(String[] name, String city, String state) {
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }
}