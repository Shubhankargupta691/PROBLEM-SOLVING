=
import java.util.Scanner;
 public class Main{
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         int n = sc.nextInt();

             int y =   Armstrong(n);
         System.out.println(y);
            }

    static int Armstrong(int x) {
            int n = order(x);
             int temp = x , sum =0;
             while(temp != 0){
                 int r = temp % 10;
                 sum += power(r , n);
                 temp = temp /10;
             }
        if (sum == x)
            return 1;
        else
            return 0;

     }
     static int power( int r , int n){
         if( n == 0){
             return 1;
         }
         if (n % 2 == 0)
             return power(r, n / 2) * power(r, n / 2);
         return r * power(r, n / 2) * power(r, n / 2);
     }

   static int order(int x) {
           int n= 0;
           while(x != 0){
               n++;
               x = x/10;
           }
           return n;
     }


 }
