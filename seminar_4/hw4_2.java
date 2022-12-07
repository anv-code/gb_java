// 2.Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package seminar_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hw4_2 {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            que.add(i);
        }

        System.out.println(que);
        enqueue(que);
        System.out.print("Очередь с новым элементом: ");
        System.out.println(que);
        int x = dequeue(que);
        System.out.printf("Первый элемент %d удалён из очереди: ", x);
        System.out.println(que);
        int y = first(que);
        System.out.printf("Теперь первый элемент в очереди: %d", y);
    }
    private static int first(Queue<Integer> que) {
        int f = que.peek();
        return f;
    }
    private static int dequeue(Queue<Integer> que) {
        int deq = que.remove();
        return deq;
    }
    private static void enqueue(Queue<Integer> que) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        que.add(a);
        sc.close();
    }
}
