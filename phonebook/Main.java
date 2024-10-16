package phonebook;

import java.util.Scanner;

public class Main {
    // Объявляем сканер для ввода данных
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Инициализация базы данных контактов
        PhoneBook.initBD();

        while (true) {
            // Запрос типа поиска у пользователя
            System.out.print("Для поиска по имени введите 1, по номеру 2, email 3 или 'Выход' для завершения: ");
            String searchType = in.nextLine();

            // Проверка на выход из программы
            if (searchType.equalsIgnoreCase("Выход")) {
                System.out.println("Выход из программы...");
                break;
            }

            // Запрос поискового значения
            System.out.print("Введите поисковое значение: ");
            String searchString = in.nextLine();

            // Обработка пустого значения
            if (searchString.trim().isEmpty()) {
                System.out.println("Ошибка: поисковое значение не должно быть пустым.");
                continue;
            }

            // Поиск контакта на основе указанного типа поиска
            Person foundPerson = PhoneBook.findPerson(searchType, searchString);

            // Проверка — если контакт найден, выводим информацию
            if (foundPerson != null) {
                System.out.println(foundPerson);
            }
        }
        in.close();  // Закрываем сканер при завершении программы
    }
}
