import java.util.*;

public class Tokens {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        if (str.isEmpty()) {
            System.out.println(0);
            return;
        }  else{

            String[] st = str.split("[ !,?._'@]+");
            System.out.println(st.length);

            for (String word : st) {
                System.out.println(word);
            }
        }
    }
}
