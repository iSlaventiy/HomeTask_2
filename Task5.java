/**Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 * Вывести массив на экран.
 * 28.08.16.
 */
public class Task5 {
    public static void main(String[] args) {
        int arr[][] = new int[8][5];
        for (int a = 0; a < 8; a++) {
            System.out.println();
            for (int b=0; b<5; b++){
                arr [a][b] = (int)(10 + Math.random() * 89);
                System.out.print(arr [a][b] +" ");
            }
        }
    }
}