//https://www.codewars.com/kata/56170e844da7c6f647000063/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(peopleWithAgeDrink(15));
    }

    public static String peopleWithAgeDrink(int age) {
        if (age < 14)return "drink toddy";
        if (age < 18) return  "drink coke";
        if (age < 21) return "drink beer";
        return "drink whisky";
    }
}