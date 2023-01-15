import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println("enter a: ");
            int a = sc.nextInt();
            System.out.println("enter b: ");
            int b = sc.nextInt();
            System.out.println("enter c: ");
            int c = sc.nextInt();
            int q = (int) ((a + (Math.pow(2, 0) * b) + (Math.pow(2, i - 1) * b)));
            System.out.println(q);
        }
    }
}