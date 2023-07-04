/* 
 * 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
 * 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.
 */

package Sem.Sem4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr_list = new ArrayList<>();
        long start_time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arr_list.add(0);
        }
        long end_time = System.currentTimeMillis();
        System.out.println(end_time - start_time);

        LinkedList<Integer> link_arr_list = new LinkedList<>();
        start_time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            link_arr_list.add(0);
        }
        end_time = System.currentTimeMillis();
        System.out.println(end_time - start_time);
    }
}
