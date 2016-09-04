/**Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 * Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
 * Если таких строк несколько, то вывести индекс первой встретившейся из них.
 * 28.08.16.
 */
public class Task6 {
    public static void main(String[] args) {
        int arr [][] = new int [7][4];
        for (int a =0; a<7; a++){
            System.out.println();
            for (int b=0; b<4;b++){
                arr [a][b] = (int) (-5 + Math.random() * 11);
                System.out.print(arr[a][b] + " ");
            }
        }
        System.out.println();
        int Count =0;
        int max = 0;
        for (int c =0; c<7;c++){
            for (int d=0;d<4;d++){
                if (max<Math.abs(arr[c][0]) * Math.abs(arr[c][d])) {
                    max = Math.abs(arr[c][0]) * Math.abs(arr[c][d]);
                    Count = c;
                }
            }
        }
        System.out.println(Count);
    }
}

