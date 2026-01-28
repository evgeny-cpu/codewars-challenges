public class Main {
    public static void main(String[] args) {
        System.out.println(abbrevName("patrick feeney"));

    }

    public static String abbrevName(String name) {
        int start = name.indexOf(' ');
        String firstName = name.substring(0,1);
        String lastName = name.substring(start +1, start+2);
        String result = firstName + "." + lastName;
        return result.toUpperCase();
    }
}