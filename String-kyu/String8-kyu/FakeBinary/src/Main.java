//Дана последовательность цифр. Необходимо заменить все цифры меньше 5 на '0', а все цифры от 5 до 1 на '1'. Верните полученную строку.
//Примечание: введенная строка никогда не будет пустой.
//https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java

public class Main {
    public static void main(String[] args) {

        String text = "45385593107843568";
        System.out.println(fakeBin(text));

    }
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]","0").replaceAll("[5-9]","1");
    }
}