import java.util.Arrays;

//В супермаркете образовалась очередь к кассам самообслуживания. Ваша задача — написать функцию для расчета общего времени, необходимого всем покупателям для совершения покупок!
//вход
//клиенты: массив положительных целых чисел, представляющих очередь. Каждое целое число представляет клиента, и его значение — это время, необходимое ему для оформления покупки.
//n: положительное целое число, количество кассовых аппаратов.
//выход
//Функция должна возвращать целое число, обозначающее общее затраченное время.
//https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(solveSuperMarketQueue(new int[]{1,2,3,4,5}, 1));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int []titles = new int[n];
        for (int time : customers){
            Arrays.sort(titles);
            titles[0] += time;
        }
        return Arrays.stream(titles).max().getAsInt();
    }
}