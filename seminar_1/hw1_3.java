// Реализовать простой калькулятор (операции + - / * )

import java.util.Scanner;


public class hw1_3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = get_number();
        int num2 = get_number();
        char operation = get_operation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }
    public static int get_number() {
        System.out.println("Введите число:");
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Неверное число");
            scan.next();
            num = get_number();
        }
        return num;
    }
    public static char get_operation() {
        System.out.println("Введите математическую операцию: ");
        char operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Неверная операция");
            scan.next();
            operation = get_operation();
        }
        return operation;
    }
    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверная операция");
                result = calc(num1, num2, get_operation());
        }
        return result;
    }
}
