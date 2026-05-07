public class Main {
    public static void main(String[] args) {


        System.out.println(getXO("zpzpzpp"));
    }

    public static boolean getXO(String str) {
        long o = str.toLowerCase().chars().filter(s -> s == 'o').count();
        long x = str.toLowerCase().chars().filter(s1 -> s1 == 'x').count();
        return o == x;
    }
}