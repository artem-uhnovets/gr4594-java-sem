/* 
 * Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
 * Для стэка и для очереди.
 */

package Sem.Sem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {
        Integer[] numbers_arr = new Integer[] {4, 9, 10, 5, 16, 8, 2, 1, 11, 6};
        print_queue(numbers_arr);
        print_stack(numbers_arr);
    }
    
    public static void print_queue(Integer[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer integer : arr) {
            queue.add(integer);
        }
        System.out.printf("Очередь %s \n", queue);
    }

    public static void print_stack(Integer[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (Integer number : arr) {
            stack.push(number);
        }
        
        for (int j = (stack.size() - 1); j >= 0; j--) {
            System.out.printf("%s ", stack.get(j));
        }
        // System.out.println(stack);
    }
    
}