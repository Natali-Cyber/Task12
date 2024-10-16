package phonebook;

public class Person {
    private String name;  // Имя человека
    private String phone;  // Номер телефона
    private String email;  // Электронная почта

    // Конструктор
    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Геттеры для получения значений полей
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // Переопределение метода toString для вывода информации о человеке
    @Override
    public String toString() {
        return "\n\nName: " + this.getName() +
                "\nPhone number: " + this.getPhone() +
                "\nEmail: " + this.getEmail();
    }
}