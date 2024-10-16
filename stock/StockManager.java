package stock;

// Класс StockManager управляет массивом товаров Stock - вся логика управления стоками (инициализация и вывод)
public class StockManager {
    private static Stock[] stocks = new Stock[10]; // Статический массив для хранения объектов Stock

    // Метод для инициализации массива товаров
    public static void initDB() {
        // Создаем и добавляем объекты Stock в массив
        stocks[0] = new Stock("Утюг");
        stocks[1] = new Stock("Сковородка");
        stocks[2] = new Stock("Лыжи");
        stocks[3] = new Stock("Шкаф");
        stocks[4] = new Stock("Пылесос");
    }

    // Метод для отображения всех объектов в массиве
    public static void showAll() {
        System.out.println("Показать все товары на складе: "); // Заголовок выводимого текста
        for (Stock stock : stocks) { // Проходим по всем элементам массива
            if (stock != null) { // Проверяем, что элемент не равен null
                System.out.println(stock); // Выводим информацию о товаре
            }
        }
    }
}