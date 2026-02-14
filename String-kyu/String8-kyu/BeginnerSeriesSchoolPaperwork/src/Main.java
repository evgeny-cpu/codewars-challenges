//Ваши одноклассники попросили вас переписать для них некоторые документы. Вы знаете, что одноклассников 'n', а документов 'm'.
//Ваша задача — рассчитать, сколько пустых страниц вам нужно. Если n < 0или m < 0вернет 0.
//https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd/train/java

public class Main {
    public static void main(String[] args) {


        System.out.println(paperWork(5,5));
    }

    public static int paperWork(int n, int m) {
        if (n < 0 || m < 0) {
            return 0;
        } else {
            return n * m;
        }
    }

}