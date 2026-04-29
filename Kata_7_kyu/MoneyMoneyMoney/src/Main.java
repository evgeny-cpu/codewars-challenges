//У мистера Скруджа есть сумма денег «P», которую он хочет инвестировать. Прежде чем это сделать, он хочет узнать, сколько лет «Y» эта сумма «P» должна храниться в банке, чтобы из нее выросла желаемая сумма денег «D».
//Сумма хранится в банке в течение «Y» лет, где ежегодно начисляются проценты «I». После уплаты налогов «T» за год новая сумма реинвестируется.
//Примечание для налогоплательщиков: налогом облагается не инвестированный основной капитал, а только начисленные проценты за год.
//https://www.codewars.com/kata/563f037412e5ada593000114/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(calculateYears(1000.00,0.05,0.18,1000.00));
    }


    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            double yearTotal = principal * interest;
            principal += (yearTotal - yearTotal * tax);
            years++;
        }
        return years;
    }
}