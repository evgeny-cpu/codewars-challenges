//https://www.codewars.com/kata/57202aefe8d6c514300001fd/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(saleHotdogs(100));

    }

    public static int saleHotdogs(final int n) {
        if (n < 5) return n * 100;
        if (n < 10) return n * 95;
        return n * 90;
    }


}