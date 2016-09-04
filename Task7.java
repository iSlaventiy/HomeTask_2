import java.util.Scanner;

/**Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n
 * 28.08.16.
 */
public class Task7 {
    public static int recursion(int m) {
        if (m == 1) {
            return 1;
        }
        else {
            return m + recursion(m - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println(recursion(scanner.nextInt()));
    }
}