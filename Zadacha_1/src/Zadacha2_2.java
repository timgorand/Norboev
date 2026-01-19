import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*Дан массив х (n) . Переписать в массив y(n) отрицательные элементы массива х деленные на 2.
(со сжатием., без пустых элементов внутри).
Затем упорядочить по возрастанию новый массив. */
public class Zadacha2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        int [] y = new int[n];
        int count =0;
        Random r = new Random();
        for (int i = 0; i<a.length; i++){
            a[i] = r.nextInt(-10, 10);
            System.out.print(a[i] + " ");
            if (a[i] <0){y[count]=a[i]/25; count++;}
        }
        System.out.println();
        Arrays.sort(y);
        for (int i=0; i<count; i++){
            System.out.print(y[i] + " ");
        }
    }
}
