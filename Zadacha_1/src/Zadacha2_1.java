import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadacha2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        Random r = new Random();
        for (int i=0;i<n;i++){
            a[i] = r.nextInt(-10, 10);
            System.out.print(a[i]+ " ");
        }
        //Создавать массив в качестве List и реверсировать через Collections.reverse(a) слишком просто
        int z = 0;
        int helper = a.length - 1;
        for (int i = 0; i<a.length/2;i++){
                z = a[helper];
                a[helper] = a[i];
                a[i] = z;
                helper--;
        }
        System.out.println();
        for (int i=0; i< a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
