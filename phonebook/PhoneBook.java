package phonebook;

import java.util.Scanner;

public class PhoneBook {
    // Массив для хранения персон
    private static Person[] persons = new Person[10];

    // Инициализация базы данных
    public static void initBD() {
        persons[0] = new Person("Юля", "89210000000", "Julia@yandex.com");
        persons[1] = new Person("Сергей", "777777", "borya@yandex.com");
        persons[2] = new Person("Друган", "23566777", "univer@yandex.com");
        persons[3] = new Person("EvilBoss", "456546546", "boss@yandex.com");
        persons[4] = new Person("Anna", "+79216661666", "mylove@yandex.com");
    }

    // Метод поиска человека по типу и значению
    public static Person findPerson(String searchType, String searchString) {
        switch (searchType) {
            case "1":
                // Поиск по имени
                return findName(searchString, persons);
            case "2":
                // Поиск по телефону
                return findPhone(searchString, persons);
            case "3":
                // Поиск по почте
                return findEmail(searchString, persons);
            default:
                System.out.println("Неправильный выбор");
                return null;
        }
    }

    // Поиск по имени
    public static Person findName(String name, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        System.out.println("Контакт не найден");
        return null;
    }

    // Поиск по телефонному номеру
    public static Person findPhone(String phone, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (person.getPhone().equals(phone)) {
                return person;
            }
        }
        System.out.println("Контакт не найден");
        return null;
    }

    // Поиск по электронной почте
    public static Person findEmail(String email, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (person.getEmail().equalsIgnoreCase(email)) {
                return person;
            }
        }
        System.out.println("Контакт не найден");
        return null;
    }
}