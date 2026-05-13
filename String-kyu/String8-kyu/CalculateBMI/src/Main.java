//https://www.codewars.com/kata/57a429e253ba3381850000fb/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(bmi(50.0, 1.80));
    }

    public static String bmi(double weight, double height) {
        double index = weight / (height * height);
        if (index <= 18.5) return "Underweight";
        if (index <= 25.0) return "Normal";
        if (index <= 30.0) return "Overweight";
        if (index > 30.0) return "Obese";
        return "";
    }
}
