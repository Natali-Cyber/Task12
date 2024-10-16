package tax;

import java.util.regex.Pattern;

public class Tax {
    // Массив строк с ценами
    private static final String[] prices = {
            "15.2", "0", "-45.2", "777.9", "36.2", "100000000.0", "372.9", "100"
    };

    // Налоговые ставки
    private static final Integer TAX_10 = 10;
    private static final Integer TAX_20 = 20;
    private static final Integer TAX_30 = 30;

    // Регулярное выражение для проверки корректности числа
    private static final String PATTERN = "^[+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$";

    // Метод для печати налога для каждого значения в массиве цен
    public static void printTax() {
        for (String s : prices) {
            // Проверка, соответствует ли строка шаблону
            if (!Pattern.matches(PATTERN, s)) {
                System.out.println("Ошибка: '" + s + "' не является корректным числом.");
                continue; // Переходим к следующему элементу в массиве
            }

            // Преобразование строки в число
            Double aDouble = Double.valueOf(s);

            // Проверка на положительное число
            if (aDouble < 0) {
                System.out.println("Ошибка: Сумма не может быть отрицательной (" + aDouble + ").");
                continue;
            }

            // Вычисление налога в зависимости от диапазона суммы
            if (0 < aDouble && aDouble <= 100) {
                System.out.println("Налог для " + aDouble + ": " + calcTax(aDouble, TAX_10));
            } else if (100 < aDouble && aDouble <= 1000) {
                System.out.println("Налог для " + aDouble + ": " + calcTax(aDouble, TAX_20));
            } else if (1000 < aDouble && aDouble <= 10000) {
                System.out.println("Налог для " + aDouble + ": " + calcTax(aDouble, TAX_30));
            } else {
                System.out.println("Ошибка: Значение (" + aDouble + ") превышает допустимые пределы.");
            }
        }
    }

    // Метод для вычисления налога
    private static Double calcTax(Double aDouble, Integer tax) {
        return aDouble * tax / 100; // Вычисление процента от суммы
    }
}