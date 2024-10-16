package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Создание объекта Scanner для ввод данных
        CalculatorManager manager = new CalculatorManager(10); // Инициализация менеджера результатов

        while (true) { // Бесконечный цикл
            System.out.print("Введите 2 числа или 'Выход' для завершения: ");
            String input = reader.next();

            // Проверка на выход
            if (input.equals("Выход")) {
                break; // Выход из цикла
            }

            // Чтение первого числа
            double first = Double.parseDouble(input);
            double second = reader.nextDouble(); // Чтение второго числа

            System.out.print("Введите оператор: (+, -, *, /): ");
            char operator = reader.next().charAt(0); // Чтение оператора

            try {
                double result = Calculator.calculate(first, second, operator); // Выполнение вычисления
                System.out.printf("%.1f %c %.1f = %.1f%n", first, operator, second, result); // Вывод результата

                // Сохранение результата в массив через менеджер
                if (!manager.saveResult(result)) {
                    System.out.println("Массив уже заполнен!"); // Массив полностью заполнен
                }

            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Выводит ошибки при вычислении
                continue; // Переход к следующей итерации
            }

            // Вывод результатов, если программа завершится
            if (manager.isFull()) {
                System.out.println("Массив заполнен, программа завершается.");
                break;
            }
        }

        // Вывод всех сохраненных результатов
        manager.displayResults();
        reader.close(); // Закрытие Scanner
    }
}
