//Рассмотрим массив/список овец, в котором некоторые овцы могут отсутствовать на своих местах.
// Нам нужна функция, которая подсчитывает количество овец, присутствующих в массиве (true означает присутствие).
//https://www.codewars.com/kata/54edbc7200b811e956000556/train/java

public class Main {
    public static void main(String[] args) {

        Boolean [] sheeps = new Boolean[]{false, null, true, false, null, null, true};

        System.out.println(countSheeps(sheeps));

    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean b : arrayOfSheeps){
            if (b == null){
                b = false;
            }
            if (b.equals(true)){
             count++;
            }
        }
        return count;
    }
}