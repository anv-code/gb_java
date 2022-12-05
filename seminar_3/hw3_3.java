// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class hw3_3 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            arr.add(i, rand.nextInt(100));
        }

        System.out.print("Список: ");
        System.out.println(arr);

        int sum = 0;
        for (int item : arr)
            sum += item;

        int avg = sum / arr.size();

        System.out.println("Максимальное: " + Collections.max(arr));
        System.out.println("Минимальное: " + Collections.min(arr));
        System.out.println("Среднее: " + avg);
    }
}
