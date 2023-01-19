import java.util.*;

public class ReverseofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
                if(str.equals(rev)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }


    }
}

