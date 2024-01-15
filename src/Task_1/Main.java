package Task_1;
/*
Хранение контактов в телефонной книге:

    Условие: Необходимо создать класс Contact, который содержит свойства name и phone, а так же метод info, возвращающий строку со значением имени и телефона.
    Создайте ArrayList из 5 контактов. Пройдитесь циклом по нему и для каждого объекта вызовите info и результат выведите в терминал
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Klym", "+49123456789"));
        contacts.add(new Contact("Hayk", "+49123456765"));
        contacts.add(new Contact("Vika", "+49134568943"));
        contacts.add(new Contact("Maryna", "+49134568948"));
        contacts.add(new Contact("Dima", "+49134538643"));

        // выводим инфу о каждом контакте
        for (Contact contact : contacts) {
            System.out.println(contact.info());
        }
    }
}
