public class Main {
    public static void main(String[] args) {
        int n=12;
       int ans= fibonachi(n);
        System.out.println(ans);
    }
    static int fibonachi(int m){
        if(m==0){
            return 0;
        }
            if(m == 1){
                return 1;
            }

        int fibo = fibonachi(m-1)+fibonachi(m-2);
            return fibo;
    }
}