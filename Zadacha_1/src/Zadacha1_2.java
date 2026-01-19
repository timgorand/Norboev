import java.util.Scanner;

public class Zadacha1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double max = Math.max(x,y);
        double min = Math.min(x,y);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        double d = (5*max - 4*min) / (8.3 + max/min);
        System.out.println("d = "+d);
    }
}
