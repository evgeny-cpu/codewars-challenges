//Числа, оканчивающиеся на ноль, скучны.
//В вашем мире они могут быть интересны, но не здесь.
//Удалите их. Только последние.
//https://www.codewars.com/kata/570a6a46455d08ff8d001002/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(noBoringZeros(1050));
    }
    public static int noBoringZeros(int n) {
        if (n == 0){
            return 0;
        }
        while (n % 10 == 0){
            n /= 10;
        }
        return n;
    }
}