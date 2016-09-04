/**Выведите на экран первые 11 членов последовательности Фибоначчи.
 * Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 * 25.08.16.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        Fibonacci(a, b);
    }
    public static void Fibonacci (int a, int b) {
        int sum;


        for (int i = 0; i < 10; i++) {
            sum = a + b;
            a = b;
            b = sum;

            if (i == 0) {
                System.out.print(1 + " " + 1 + " ");
            } else
                System.out.print(sum + " ");
        }
    }
}