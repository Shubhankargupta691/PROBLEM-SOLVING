import java.util.*;
public  class ArmyGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = (int)(Math.ceil(n/2.0));
            int y = (int)(Math.ceil(m/2.0));
            int ans = x*y;
        System.out.println(ans);
    }

}