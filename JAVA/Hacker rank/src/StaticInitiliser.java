
import java.util.*;
public class StaticInitiliser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        parallelogram(b, h);
    }

    static void parallelogram(int b, int h) {

        if (b > 0 && h > 0) {
            System.out.println(b * h);
        } else if (b < 0 && h > 0 || b >= 0 && h < 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
