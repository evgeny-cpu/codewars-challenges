//В вашем классе был контрольный тест, и вы его сдали. Поздравляем!
//Но вы амбициозный человек. Вам хочется узнать, лучше ли вы среднестатистического ученика в вашем классе.
//Вы получаете массив с результатами тестов ваших однокурсников. Теперь рассчитайте среднее значение и сравните свой результат!
//Вернитесь, true если вам станет лучше, в противном случае false!
//Примечание:
//Ваши баллы не включаются в общий массив баллов вашего класса. Не забудьте учесть их при расчете среднего балла!
//https://www.codewars.com/kata/5601409514fc93442500010b/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(betterThanAverage(new int[]{2,3},5));
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int point : classPoints){
        sum+= point;
        }
        return sum / classPoints.length < yourPoints ? true : false;

    }
}