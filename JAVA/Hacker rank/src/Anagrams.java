import java.util.*;
import java.util.Scanner;
public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente a");
        String s1 = sc.next();
        System.out.println("enter b");
        String s2 = sc.next();
        sc.close();
        boolean ret = isAnagram(s1, s2);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String s1, String s2) {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
        if(s1.length() == s2.length()){
        int i;
            int [] a = new int[256];
            int [] b = new int[256];
            for( i = 0; i< s1.length();i++){
                    a[(int) s1.charAt(i)] += 1;
                    b[(int) s2.charAt(i)] += 1;
            }
            for( i =0;  i< 256; i++){
                if(a[i] != b[i])
                    return false;
            }
            return true;
        }else{
            return false;
        }

    }

}