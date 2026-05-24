//https://www.codewars.com/kata/551f37452ff852b7bd000139/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(binaryAddition(1,1));

    }
    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a + b);
    }
}