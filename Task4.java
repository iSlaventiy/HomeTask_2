/**Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так,
 *  что слева от двоеточия показывается симметричная комбинация для той,
 *  что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 * 28.08.16.
 */

public class Task4 {
    public static void main(String[] args) { // главный метод
        int count = 0; // старт отсчета
        for (int a=0; a<=2; a++) { // перебор первой цыфры
            for (int b=0; b<=5; b++) { // перебор второй цыфры
                count++; // отсчет +
                StringBuilder Skleyka = new StringBuilder(5); //создание склейки
                if (a == 2 & b == 4) // исключение
                    break;
                Skleyka.append(a).append(b).append(":").append(b).append(a); // метод StringBildera
                System.out.println(count); // вывод количества countov
            }
        }
    }
}

