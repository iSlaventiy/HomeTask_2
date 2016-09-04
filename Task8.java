/**Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент последовательности Фибоначчи
 * для вычисления пятнадцатого элемента.
 * 31.08.16.
 */
public class Task8 {
    static int count;

    public static void main(String[] args) {
        fib(15);
        System.out.println(count);
    }
    static int fib (int f) {
        if (f==1) return 1;
        if (f==2) return 2;
        if (f==4) count++;
        return fib(f-1) + fib(f-2);
    }
}
