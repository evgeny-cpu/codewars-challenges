//Эта ката посвящена умножению заданного числа на восемь, если оно четное, и на девять в противном случае.
//https://www.codewars.com/kata/583710ccaa6717322c000105/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(simpleMultiplication(5));
    }

    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;

    }
}