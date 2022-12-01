// 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package seminar_2;

import java.io.FileWriter;
import java.util.Arrays;

public class hw2_2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 3, 9, 2, 0};

        for (int j = arr.length - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }

            try (FileWriter fw = new FileWriter("seminar_2/log.txt", true)) {
                fw.write(Arrays.toString(arr));
                fw.write("\n");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
