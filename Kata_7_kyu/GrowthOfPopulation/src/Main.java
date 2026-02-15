//В небольшом городке численность населения p0 = 1000в начале года составляет [число жителей]. Численность населения регулярно увеличивается на [число жителей 2 percent] в год, и, кроме того, 50каждый год в город приезжают новые жители.
// Сколько лет потребуется городу, чтобы его численность населения превысила или сравнялась с p = 1200[число жителей]?
//https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;
        while (p0 < p) {
            p0 +=  p0 * percent / 100 + aug;
            year++;
        }
        return year;
    }
}