
import java.util.*;
public class Introstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String b = sc.next();
            int  c = a.length();
            int d = b.length();

            System.out.println(c+d);
        if(a.compareTo(b)<0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1,a.length())+" "+b.substring(0,1).toUpperCase()+b.substring(1,b.length()));
    }
}

