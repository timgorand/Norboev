import java.util.Scanner;

public class Zadacha1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (x>y) {System.out.println(x*x);}
        else { System.out.println(y*y); }
    }
}