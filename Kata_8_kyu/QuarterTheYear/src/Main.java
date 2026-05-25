//Дано число месяца от 1 до 12, верните число, обозначающее квартал года, к которому он относится, в виде целого числа.
//Например: 2-й месяц (февраль) относится к первому кварталу; 6-й месяц (июнь) — ко второму кварталу; а 11-й месяц (ноябрь) — к четвертому кварталу.
//https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/train/java
public class Main {
    public static void main(String[] args) {
        System.out.println(quarterOf(11));
    }

    public static int quarterOf(int month) {
        if (month >= 1 && month <= 3) return 1;
        if (month >= 4 && month <= 6) return 2;
        if (month >= 7 && month <= 9) return 3;
        if (month >= 10 && month <= 12) return 4;

        return month;
    }
}