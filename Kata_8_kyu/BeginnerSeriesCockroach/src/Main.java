//https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(cockroachSpeed(1.08));
    }
    public static int cockroachSpeed(double x){
        return (int)Math.floor(x * 100_000 / 3600);
    }
}