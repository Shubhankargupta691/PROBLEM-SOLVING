import java.util.*;
import java.util.Scanner;
public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente a");
        String a = sc.next();
        System.out.println("enter b");
        String b = sc.next();
        sc.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a, String b) {
        if(a.length() == a.length()){
            System.out.println();
        }
        return false;
    }

}