//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//If the function is passed a valid PIN string, return true, else return false.
//https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(validatePin("123456"));

    }
    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }
}