//Напишите функцию, которая возвращает центр двумерного массива.
//Если нет ни одного центрального элемента, функция должна возвращать nil/ None/ null/ (и т. д., используйте эквивалент пустого значения в вашем языке программирования).Nothing
//Можно предположить, что все входные данные будут представлять собой прямоугольные матрицы в виде массивов. Например:[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//https://www.codewars.com/kata/54c91b5228ec4c3b5900036e/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(center(new int[3][0]));
    }

    public static Integer center(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }
        int a = matrix.length;
        int b = matrix[0].length;
        if (a % 2 == 0 || b % 2 == 0){
            return null ;
        }

        return matrix[a/2][b/2];
    }
}