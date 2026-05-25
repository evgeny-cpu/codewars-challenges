//Завершите функцию, которая вычисляет площадь красного квадрата, если Aв качестве входных данных задана длина дуги окружности. Верните результат, округленный до двух десятичных знаков.
//https://www.codewars.com/kata/5748838ce2fab90b86001b1a/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(squareArea(2));
    }
    public static double squareArea(double A){
        double radius = (2 * A) / Math.PI;
        return  Math.round(radius * radius *  100.0) /100.0;
    }
}