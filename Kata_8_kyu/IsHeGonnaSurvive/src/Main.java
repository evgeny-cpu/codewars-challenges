//https://www.codewars.com/kata/59ca8246d751df55cc00014c/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(hero(1750882764 ,1561506954));
    }
    public static boolean hero(long bullets, long dragons) {
        return bullets >= dragons * 2;
    }
}