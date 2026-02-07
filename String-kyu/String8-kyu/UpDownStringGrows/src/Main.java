//Многие языки программирования предоставляют возможность преобразования строки в верхний или нижний регистр.
// Например, upcase символ / downcase в Ruby, upper/ lower в Python, toUpperCase/ toLowerCase в Java/JavaScript и uppercase/ lowercase в Kotlin.
// Как правило, эти методы не изменяют размер строки.
//Например, в Ruby str.upcase.downcase.size == str.size это работает true в большинстве случаев.
//Однако в некоторых особых случаях длина преобразованной строки может быть больше, чем длина исходной.
// Можете ли вы найти строку, удовлетворяющую этому критерию?
//Например, в Ruby это означает:str.upcase.downcase.size > str.size
//Вам следует просто установить значение, STRANGE_STRING соответствующее предыдущим критериям.
//Примечание: В этом задании метапрограммирование запрещено. Поэтому размер вашего решения ограничен.
//https://www.codewars.com/kata/644b17b56ed5527b09057987/train/java

public class Main {
    public static void main(String[] args) {

    }
    static final String STRANGE_STRING = "ß";

}