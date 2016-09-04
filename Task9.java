import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**Создайте код, который выводит все простые числа из интервала от 2 до n
 * (заданного с клавиатуры). Результат должен быть: 2,3,5,7 ...
 * 31.08.16.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> list = new TreeMap<>();
        number(scanner.nextInt(), list);

        for (int a : list.keySet()) {
            System.out.println(a);
        }
    }
    public static void number (int a, Map<Integer, Integer> map) {
        if (a==0) return;
        for (int i = 1; i < a; i++) {
            if (a == 2) {
                map.put(a, 0);
            }
            else if (a % i == 0 && i != 1) {
                break;
            }
            else if (i + 1 == a) {
                map.put(a, 0);
            }
        }
        number(a - 1, map);
    }
}
