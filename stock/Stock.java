package stock;

// Класс Stock представляет товар в БД
public class Stock {
    private String name; // Название товара

    // Конструктор, который инициализирует название товара
    public Stock(String name) {
        this.name = name; // Присваиваем переданное имя полю name
    }

    // Метод для получения названия товара
    public String getName() {
        return this.name; // Возвращаем имя товара
    }

    // Переопределение метода toString для удобного вывода информации об объекте
    public String toString() {
        return "\nТовар: " + this.getName(); // Форматированный вывод названия товара
    }
}