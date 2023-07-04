// import java.util.Scanner;
// public class task1 {
//     public static void main(String[] args) {
//         Scanner zapros = new Scanner(System.in, "cp866");
//         System.out.print("Введите имя: ");
//         String name = zapros.nextLine();
//         System.out.println("Приветствую, " + name);
//     }
// }

/* 
 * Дан массив двоичных чисел, например [1,1,0,1,1,1],
 * вывести максимальное количество подряд идущих 1.
 */
public class task1{
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1 };
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
            else {
                if (count > max) {
                    max = count;
                    count = 0;
                }
            }
        }

        max = count > max ? count : max;
        System.out.println(max);
    }
}