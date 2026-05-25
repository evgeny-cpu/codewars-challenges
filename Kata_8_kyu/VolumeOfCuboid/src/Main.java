//Бобу нужен быстрый способ вычисления объема прямоугольного параллелепипеда , имеющего три параметра: массу length, объем widthи heightобъем параллелепипеда.
//Напишите функцию, которая поможет Бобу выполнить это вычисление.
//https://www.codewars.com/kata/58261acb22be6e2ed800003a/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(getVolumeOfCuboid(5.2,2.2,5.1));

    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}