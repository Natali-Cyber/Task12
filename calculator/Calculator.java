package calculator;

import java.util.Scanner;

public class Calculator {

    // Метод для выполнения арифметической операции
    public static double calculate(double first, double second, char operator) {
        double result = 0.0;

        // Выполнение операции в зависимости от оператора
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                if (second != 0) { // Проверка на деление на ноль
                    result = first / second;
                } else {
                    throw new ArithmeticException("Ошибка: деление на ноль!"); // Исключение для деления на ноль
                }
                break;
            default:
                throw new IllegalArgumentException("Ошибка: некорректный оператор"); // Исключение для неверного оператора
        }

        return result; // Возврат результата вычисления
    }
}