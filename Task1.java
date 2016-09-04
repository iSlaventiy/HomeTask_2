import java.util.Scanner;

/**Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
 *  (заранее не известно сколько цифр будет в числе).
 * 25.08.16.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){

            String x = scanner.nextLine();
            char[] array = x.toCharArray();
            int sum = 0;

            for (int i=0; i<array.length; i++) {
                sum += Integer.parseInt(String.valueOf (array[i]));
            }
            System.out.println(sum);
        }
    }
}