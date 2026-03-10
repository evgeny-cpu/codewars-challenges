//Story
//Ben has a very simple idea to make some profit: he buys something and sells it again. Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price. Instead, he's going to buy it for the lowest possible price and sell it at the highest.
//Task
//Write a function that returns both the minimum and maximum number of the given list/array.
//https://www.codewars.com/kata/559590633066759614000063/train/java
public class Main {
    public static void main(String[] args) {
        int[] number = new int[]{1};

        for (int i : minMax(number)) {
            System.out.println(i);
        }
    }

    public static int[] minMax(int[] arr) {
        int[] result = new int[2];
        result[0] = arr[0];
        result[1] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            result[0] = Math.min(result[0], arr[i]);
            result[1] = Math.max(result[1], arr[i]);
        }
        return result;
    }
}