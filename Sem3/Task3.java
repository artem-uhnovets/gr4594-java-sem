/* 
 * Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
 */

package Sem.Sem3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rnd.nextInt(999));
        }

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }

    static ArrayList<Integer> create_ArrayList_random(int length, int upper_num) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            numbers.add(rnd.nextInt(upper_num));
        }
        return numbers;
    }
}
