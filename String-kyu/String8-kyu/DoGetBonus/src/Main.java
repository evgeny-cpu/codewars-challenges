// Создайте функцию, которая принимает два аргумента (зарплата, бонус). Зарплата будет целым числом, а бонус — логическим значением.
// Если бонус действителен, зарплату следует умножить на 10. Если бонус недействителен, то богач заработал недостаточно денег и должен получить только заявленную зарплату.
// Возвращает общую сумму, которую получит получатель, в виде строки с префиксом £(= "\u00A3"
// https://www.codewars.com/kata/56f6ad906b88de513f000d96/train/java


public class Main {
    public static void main(String[] args) {
        System.out.println(bonusTime(10000,true));
    }
    public static String bonusTime(final int salary, final boolean bonus) {
        String result =  "\u00A3";
        if (bonus == true){
            result += (salary * 10);
        }else {
            result+= salary;
        }
        return result;

    }
}


