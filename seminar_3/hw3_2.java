// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

package seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class hw3_2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            arr.add(i, rand.nextInt(100));
        }

        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }

        System.out.println(arr);
    }
}
