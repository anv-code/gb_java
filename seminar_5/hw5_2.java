package seminar_5;

// Пусть дан список сотрудников.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class hw5_2 {
    public static void main(String[] args) {
        String[] people = new String[] { "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов" };

        Map<String, Integer> names = new HashMap<>();
        for (String person : people) {
            String name = person.split(" ")[0];
            if (!names.containsKey(name))
                names.put(name, 1);
            else
                names.put(name, names.get(name) + 1);
        }

        names.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(person -> System.out.println("Имя \"" + person.getKey() + "\" в количестве " +
                        person.getValue() + " шт"));
    }
}
