// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package seminar_4;

import java.util.LinkedList;
import java.util.Random;

public class hw4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            lst.add(i, rnd.nextInt(10));
        }

        System.out.print("Список: ");
        System.out.println(lst);

        LinkedList<Integer> reslst = new LinkedList<>();

        for (int i = lst.size() - 1; i >= 0; i--) {
            reslst.add(lst.get(i));
        }

        System.out.print("Перевернутый список: ");
        System.out.println(reslst);
    }
}
