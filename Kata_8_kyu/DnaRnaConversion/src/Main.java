//Рибонуклеиновая кислота, РНК, является основной молекулой-переносчиком в клетках.
// РНК несколько отличается от ДНК по своей химической структуре и не содержит тимина.
// В РНК тимин заменен другой нуклеиновой кислотой — урацилом («U»).
//Создайте функцию, которая преобразует заданную последовательность ДНК в РНК.
//https://www.codewars.com/kata/5556282156230d0e5e000089/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(dnaToRna("GCAT"));
    }
    public static String dnaToRna(String dna) {
        return dna.replaceAll("T","U");
    }
}