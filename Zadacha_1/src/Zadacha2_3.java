import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Zadacha2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        Vector E = new Vector();
        System.out.println("Введите число от 1 до 10");
        int z = in.nextInt();
        int[][] M = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                M[i][j] = r.nextInt(1, 10);
            }
        }
        int i = in.nextInt()-1;
        for (int j = 0; j < 5; j++) {
            if (M[i][j] < z) E.add(M[i][j]);
        }
        System.out.print(E);
    }

}
