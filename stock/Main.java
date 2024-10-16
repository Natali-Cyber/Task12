package stock;

// Главный класс программы, содержащий метод main. Вызывает методы из класса StockManager для выполнения операций.
public class Main {
    // Главный метод программы, точка входа
    public static void main(String[] args) {
        StockManager.initDB(); // Инициализируем массив товаров
        StockManager.showAll(); // Показываем все товары в массиве
    }
}