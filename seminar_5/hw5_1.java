package seminar_5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class hw5_1 {
    public static void main(String[] args) {
        Map<String, String> phone_book = new HashMap<>();
        phone_book.putIfAbsent("89115001010", "Контакт_1");
        phone_book.putIfAbsent("89115004040", "Контакт_2");
        phone_book.putIfAbsent("89115002020", "Контакт_3");
        phone_book.putIfAbsent("89115003030", "Контакт_2");

        for (String num : phone_book.keySet()) {
            System.out.println(String.format("Номер телефона: %s - принадлежит контакту: %s", num, phone_book.get(num)));
        }
    }
}
