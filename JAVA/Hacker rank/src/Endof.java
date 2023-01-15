
import java.util.Arrays;
import java.util.Scanner;

public class Endof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; sc.hasNext(); i++) {
            int str = sc.nextInt();
          System.out.println(i + " "+str);
        }
        sc.close();
        }
    }
