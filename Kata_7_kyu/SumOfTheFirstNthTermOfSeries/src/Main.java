//https://www.codewars.com/kata/555eded1ad94b00403000071/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(seriesSum(5));

    }

    public static String seriesSum(int n) {
        double sum = 0.00d;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + i * 3);
        }
        return String.format("%.2f",sum);
    }
}