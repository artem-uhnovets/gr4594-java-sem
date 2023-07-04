/* 
* Создать список типа ArrayList. Поместить в него как строки, так и целые числа. 
* Пройти по списку, найти и удалить целые числа.

* el instanceof String
 */

package Sem.Sem3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Task2 {
    public static void main(String[] args) {
        ArrayList my_arraylist = new ArrayList<>(Arrays.asList("Текст1", 1 ,"Текст2", 2, 3, 4, 5, "Текст3"));
        for (int j = 0; j < args.length; j++) {
            
        }
        for (int i = 0; i < my_arraylist.size(); i++) {
            if (my_arraylist.get(i) instanceof Integer) {
                my_arraylist.remove(i);
                i--;
            }
        }
        System.out.println(my_arraylist);

        Iterator iter = al.iterator();

        while (iter.hasNext()) {
        if (iter.next() instanceof Integer) {
            iter.remove();
            }
        }
    }
}
