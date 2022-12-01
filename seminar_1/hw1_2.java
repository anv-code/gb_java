// Вывести все простые числа от 1 до 1000
package seminar_1;

import java.util.Scanner;


public class hw1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scan.nextInt();
        int count = 0;
        scan.close();

        for (int i = 2; i < input; i++) {
            boolean is_prime_number = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    is_prime_number = false;
                    break;
                }
            }

            if (is_prime_number) {
                count++;
                System.out.print(i + ", ");
            }
        }

        System.out.println("Количество простых чисел: " + count);
    }
}
