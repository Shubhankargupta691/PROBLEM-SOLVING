import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Dublicate {
    public static String
    removeDuplicateWords(String input)
    {

        String reg = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(input);

       while(m.find()){
           input = input.replaceAll(m.group(),m.group(1));
       }
        return input;
    }
    public static void main(String args[])
    {

        // Test Case: 1
        String str1
                = "Good bye bye world world";
        System.out.println(
                removeDuplicateWords(str1));
    }
}

