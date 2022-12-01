// 1. Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package seminar_2;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

public class hw2_1 {
    public static void main(String[] args) {
        String input = get_data_from_file("seminar_2/json.txt");
        String inputString = input.replace('"', ' ').replace(':', ',').replace('}', ' ').replace('{', ' ').replaceAll("\\s+","");
        ArrayList<String> arr = new ArrayList<>(List.of(inputString.split(",")));

        String result = "";
        result += "\"";
        for (int i = 1; i < arr.size(); i += 2) {
            if (arr.get(i) != null) {
                result += arr.get(i - 1) + " = '" + arr.get(i) + "'";
                if (i != arr.size() - 1) result += " AND ";
            }
        }
        result += "\"";
        System.out.println(result);
    }

    private static String get_data_from_file(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error";
        }
    }
}
