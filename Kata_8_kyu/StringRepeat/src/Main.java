public class Main {
    public static void main(String[] args) {
        System.out.println(repeatStr(2,"hello"));

    }
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 1; i <= repeat; i ++){
            result += string;
        }
        return result;
    }
}