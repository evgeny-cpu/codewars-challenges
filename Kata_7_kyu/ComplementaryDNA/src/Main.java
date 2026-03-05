//Дезоксирибонуклеиновая кислота (ДНК) — это химическое вещество, находящееся в ядре клеток и содержащее «инструкции» для развития и функционирования живых организмов.
//Если хотите узнать больше: http://en.wikipedia.org/wiki/DNA
//В цепочках ДНК символы «А» и «Т» являются комплементарными друг другу, как «С» и «Г». Ваша функция получает одну сторону ДНК (цепочки, за исключением Haskell);
// вам нужно вернуть другую, комплементарную сторону. Цепочка ДНК никогда не бывает пустой или ДНК вообще отсутствует (опять же, за исключением Haskell).
//https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(makeComplement("ATTGC"));

    }
    public static String makeComplement(String dna) {
        return dna.replaceAll("A","t").replace("T","a").replace("C","g").replace("G","c").toUpperCase();
    }
}