import java.util.Random;
import java.util.Scanner;

public class Zadacha2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 1;
        Random r = new Random();
        int[][] M = new int[n][n];
        for (int i=0; i<n;i++){
            for (int j=0; j<n;j++){
                M[i][j] = r.nextInt(1,10);
            }
        }
        for (int i=n-1; i > -1;i--){
            for (int j=0; j<n;j++){
                s*=M[i][j];
                System.out.print(M[i][j]+ " ");
            }
        }
        System.out.println();
        System.out.println(s);
        System.out.println(Math.pow(s, (double) 1 /n));
    }
}