/* 
 * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */


package Sem.Sem5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> passports = new HashMap<>();
        passports.put(123456, "Иванов");
        passports.put(321456, "Васильев");
        passports.put(234561, "Петрова");
        passports.put(234432, "Иванов");
        passports.put(654321, "Петрова");
        passports.put(345678, "Иванов");
        for (var item : passports.entrySet()) {
            if (item.getValue().equalsIgnoreCase("иванов")) {
                System.out.println(item.getKey());
            }
        }
    }
    

}
