package seminar_6;

// Создать класс Ноутбук для магазина техники.
// Добавить атрибуты класса с соответствующими типами.
// Например,
// - идентификатор
// - производитель
// - название модели
// - RAM
// - объем HD
// - операционная система
// - и т.д.
// Добавить конструктор класса.
// Добавить необходимые методы класса.

// Создать множество ноутбуков (множество объектов класса ноутбук).
// 3-10 штук

// Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки, отвечающие критерию.
// Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - RAM
// 2 - Объем HD
// 3 - Операционная система
// 4 - Цвет …

// Для критериев объем и память необходимо запросить дополнительно диапазон.
// Например,
// "Введите минимальное значение"
// "Введите максимальное значение"

// Отфильтровать ноутбуки и вывести проходящие по критерию.
// Пример вывода:

// Ноутбуки с объем HD от 256 до 512
// 1 HP EliteBook...
// 2..
// 3...

// Пример вывода:

// Ноутбуки с цвет Серебристый
// 1 Honor ...
// 2..
// 3...

import java.util.Scanner;

public class hw6_1 {
    public static void main(String[] args) {
        // (int id, String firm, String model, int ramVolume, int hdVolume, String os, String color)
        Notebook nb1 = new Notebook(1,"HP", "Probook", 8, 256, "Windows 10", "Silver");
        Notebook nb2 = new Notebook(2,"HP", "Probook", 8, 512, "Windows 10", "Black");
        Notebook nb3 = new Notebook(3,"MSI", "Creator", 16, 1024, "Windows 10", "Silver");
        Notebook nb4 = new Notebook(4,"DELL", "XPS15", 16, 512, "Linux", "Black");
        Notebook nb5 = new Notebook(5,"Apple", "MacBook", 8, 256, "Mac OS", "Silver");
        Notebook nb6 = new Notebook(6,"Huawei", "D15", 8, 512, "Windows 10", "Red");
        Notebook nb7 = new Notebook(7,"ASUS", "TUF Gaming", 16, 1024, "Linux", "Black");

        Notebook[] nb = new Notebook[]{nb1, nb2, nb3, nb4, nb5, nb6, nb7};

        System.out.println("Введите цифру, соответствующую необходимому критерию: \n 1 - Объем HDD \n 2 - Операционная система \n 3 - Цвет");
        Scanner iScanner = new Scanner(System.in);
        Integer tmp = iScanner.nextInt();

        if (tmp == 1) {
            System.out.print("Введи минимальный объем HDD: ");
            Scanner iScanner1 = new Scanner(System.in);
            Integer hddMin = iScanner1.nextInt();
            System.out.print("Введи максимальный объем HDD: ");
            Scanner iScanner2 = new Scanner(System.in);
            Integer hddMax = iScanner2.nextInt();
            System.out.println(Notebook.getHDD(nb, hddMin, hddMax));
            iScanner1.close();
            iScanner2.close();
        }

        if (tmp == 2) {
            System.out.println("Выбери операционную систему: \n 1 - Windows 10 \n 2 - Linux \n 3 - Mac OS");
            Scanner iScannerNew = new Scanner(System.in);
            Integer temp = iScannerNew.nextInt();

            if (temp == 1) {
                System.out.println(Notebook.getOS(nb, "Windows 10"));
            }
            else if (temp == 2) {
                System.out.println(Notebook.getOS(nb, "Linux"));
            }
            else if (temp == 3) {
                System.out.println(Notebook.getOS(nb, "Mac OS"));
            }

            iScannerNew.close();
        }

        if (tmp == 3) {
            System.out.println("Выбери цвет: \n 1 - Black \n 2 - Silver \n 3 - Red");
            Scanner iScannerNew = new Scanner(System.in);
            Integer temp = iScannerNew.nextInt();
            if (temp == 1) {
                System.out.println(Notebook.getColor(nb, "Black"));
            }
            else if (temp == 2) {
                System.out.println(Notebook.getColor(nb, "Silver"));
            }
            else if (temp == 3) {
                System.out.println(Notebook.getColor(nb, "Red"));
            }
            iScannerNew.close();
        }

        iScanner.close();
    }
}
