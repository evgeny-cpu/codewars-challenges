//https://www.codewars.com/kata/5cb7baa989b1c50014a53333/train/java
public class Main {
    public static void main(String[] args) {

        char[][] chars = new char[][]{
                {'T', 'E', 'N'},
                {'E', 'Y', 'E'},
                {'N', 'E', 'T'}
        };
        System.out.println(isSatorSquare(chars));
    }


    public static Boolean isSatorSquare(char[][] t) {
        int n = t.length;
        for (int r = 0; r < n; r++)
            for (int c = 0; c < n; c++)
                if (t[r][c] != t[c][r] || t[r][c] != t[n-1-r][n-1-c])
                    return false;
        return true;
    }
}

