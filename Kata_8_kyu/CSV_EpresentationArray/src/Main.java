//Создайте функцию, которая возвращает CSV-представление двумерного числового массива.
//https://www.codewars.com/kata/5a34af40e1ce0eb1f5000036/train/java

public class Main {
    public static void main(String[] args) {

        int[][] x = {{0, 1, 2, 3, 45},
                {10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34}};

        System.out.println(toCsvText(x));
    }

    public static String toCsvText(int[][] array) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i ++){
            for (int a = 0; a <array[i].length;a++){
                result.append(array[i][a]);
                if (a < array[i].length-1){
                    result.append(",");
                }
            }
            if (i < array.length - 1){
                result.append("\n");
            }
        }
        return result.toString();
    }
}