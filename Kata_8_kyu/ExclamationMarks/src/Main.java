public class Main {
    public static void main(String[] args) {

        System.out.println(replace("Hi"));
    }
    public static String replace(final String s) {

        return s.replaceAll("[A,E,I,O,U,a,e,i,o,u]","!");
    }
}