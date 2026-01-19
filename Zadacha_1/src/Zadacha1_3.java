import java.util.Random;
import java.util.Scanner;

public class Zadacha1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Random r = new Random();
        double a = r.nextDouble(1,10);
        double b = r.nextDouble(1,10);
        double Y=0;
        double F=0;
        if (x<=0){
            Y=a-Math.pow(b,x+1);
            F=Math.pow(Math.E,Math.tan(2*x+1));
        }
        else if (x <= 3) {
            Y=1+Math.pow(3,x*a);
            F= x*x - Math.pow(Math.sin(x),4);
        }
        else {
            Y= 1/Math.tan(a*x+1);
            F= Math.pow(x*x, (double) 1 /5);
        }
        System.out.println("Y = "+ Y);
        System.out.println("F = " +F);
    }
}
