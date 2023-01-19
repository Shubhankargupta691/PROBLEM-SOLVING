import java.util.*;
public class substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String str = sc.nextLine();
        System.out.println(str);
            int n = sc.nextInt();
            int m = sc.nextInt();
        System.out.println(n+" "+m);
        System.out.println(str.substring(n,m));
    }
}
