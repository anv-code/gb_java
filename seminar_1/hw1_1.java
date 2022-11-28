// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;


public class hw1_1 {
    public static int get_sum(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    public static int get_factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String args[]) {
        System.out.println("Введите число N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Сумма чисел" + " от 1 до " + n + " равна: " + get_sum(n));
        System.out.println("Факториал числа " + n + " равен: " + get_factorial(n));
        sc.close();
    }
}