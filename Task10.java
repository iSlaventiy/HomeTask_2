import java.util.Scanner;
/**Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются размером и лежат меньшее на большем.
 *Требуется перенести пирамиду из N колец с одного стержня на другой за наименьшее число ходов.
 *За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.
 */
class Task10 {
    char spire1;
    char spire2;
    char spire3;
    int n;
    Task10(){
        spire1 = 'A';
        spire2 = 'B';
        spire3 = 'C';
        System.out.print("Kоличество дисков n = ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
    }
    void moveDisks(int n, char source, char destination, char temporary){
        if (n == 1){
            System.out.printf("%d %c %s %c%n" , n, source, "на", destination);
        }
        else{
            moveDisks(n-1, source, temporary, destination);
            System.out.printf("%d %c %s %c%n" , n, source, "на", destination);
            moveDisks(n-1, temporary, destination, source);
        }
    }
    public static void main(String[] args) {
        Task10 ht = new Task10();
        ht.moveDisks(ht.n, ht.spire1, ht.spire2, ht.spire3);
    }
}

