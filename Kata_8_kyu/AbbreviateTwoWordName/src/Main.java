public class Main {
    public static void main(String[] args) {
        System.out.println(abbrevName("patrick feeney"));

    }

    public static String abbrevName(String name) {
        String [] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}