/* 
 * Напишите метод, который сжимает строку. 
Ввод: aaaabbbcdd.
Вывод: a4b3cd2
 */

package Sem.Sem2;

public class Task2 {
    public static void main(String[] args) {
        String stroka = "aaaabbbcddf";
        char temp = stroka.charAt(0);
        int count = 1;
        for (int i = 1; i < stroka.length(); i++) {
            if (stroka.charAt(i) == temp){
                count++;
                
            } else {
                if (count == 1) {
                    System.out.printf("%c", temp);
                } else {
                    System.out.printf("%c%d", temp, count);
                }
                count = 1;
                temp = stroka.charAt(i);
            }
            if (i == (stroka.length() - 1) ) {
                    if (count == 1) {
                    System.out.printf("%c", stroka.charAt(i));
                    } else {
                    System.out.printf("%c%d", stroka.charAt(i), count);
                    }
                }
        }
    }
}