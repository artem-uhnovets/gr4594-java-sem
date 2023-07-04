/* 
 * 1. Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 50.

2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

Для вычисления процента используйте формулу:

процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */

// %.2f вывод 2х знаков после запятой


package Sem.Sem6;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = create_ArrayList_random(100, 0, 50);
        System.out.println(numbers);
        
    }

    public static ArrayList<Integer> create_ArrayList_random(int length, int lower_num,int upper_num) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        int num_for_add = -1;
        for (int i = 0; i < length; i++) {
            num_for_add = -1;
            while (num_for_add < lower_num) {
            num_for_add = rnd.nextInt(upper_num);
            }
            numbers.add(num_for_add);
        }
        return numbers;
    }
}
