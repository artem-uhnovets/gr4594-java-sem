/* Реализовать консольное приложение, которое:

1. Принимает от пользователя строку вида

text

1. Нужно сохранить text в связный список.
2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка */

package Sem.Sem4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> str_linked_list = new LinkedList<String>();
        Scanner input_data = new Scanner(System.in);
        String input_text;

        while (true) {
            input_text = input_data.nextLine();
            if (input_text.startsWith("print~", 0)) {
                System.out.println(str_linked_list.remove(input_text.substring(6)));
            } else if (input_text.equals("exit")) {
                break;
            } else {
                str_linked_list.add(input_text);
            }
            System.out.println(str_linked_list);
        }
    }
}
