public class Main {
    public static void main(String[] args) {
        int n = 5;

        int ans = factorial(n);
        System.out.println(ans);
    }

    static int factorial(int num) {
        if(num>=1){
            return num * factorial(num - 1);}
             else{
            return 1;}
    }
}