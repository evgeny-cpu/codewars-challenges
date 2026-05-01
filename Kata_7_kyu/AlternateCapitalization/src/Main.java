//https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java
public class Main {
    public static void main(String[] args) {


        String[] result = capitalize("abcdef");
        for (String s : result) {
            System.out.print(s);
        }
    }

    public static String[] capitalize(String s) {
        char[] line1 = s.toCharArray();
        char[] line2 = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                line1[i] = Character.toUpperCase(line1[i]);
            } else {
                line2[i] = Character.toUpperCase(line2[i]);

            }
        }
        return new String[]{new String(line1), new String(line2)};
    }

}