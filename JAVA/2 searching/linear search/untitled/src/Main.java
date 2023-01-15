import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        String name="TONY";
        char target= 'O';

       boolean ans=linearsearch(name, target);
     //   System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(ans);

    }

    static boolean linearsearch(String str , char target) {
            if(str.length()==0){
                return false;
            }
//    for( int i=0;i<str.length();i++){
//        if(str.charAt(i)== target)
        for(char ch:str.toCharArray()){     //for each loop
                    if(ch==target)
                return true;
             }
                return false;
        }
    }
