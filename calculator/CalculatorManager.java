package calculator;

public class CalculatorManager {
    private double[] results; // Массив для хранения результатов
    private int index; // Индекс для отслеживания текущей позиции в массиве

    // Конструктор для инициализации массива
    public CalculatorManager(int size) {
        results = new double[size]; // Инициализация массива
        index = 0; // Начальное значение индекса
    }

    // Метод для сохранения результата
    public boolean saveResult(double result) {
        if (index < results.length) { // Проверяем, есть ли свободное место в массиве
            results[index++] = result; // Сохраняем результат и увеличиваем индекс
            return true; // Возвращаем успех
        } else {
            return false; // Массив заполнен
        }
    }

    // Метод для вывода всех результатов
    public void displayResults() {
        System.out.println("Результаты:");
        for (double r : results) {
            if (r != 0) { // Только заполненные ячейки
                System.out.println(r);
            }
        }
    }

    // Метод для проверки, заполнен ли массив
    public boolean isFull() {
        return index >= results.length; // Проверка, достигнут ли лимит массива
    }
}
