public class Main {
    public static void main(String[] args) {

        int n=5;
        int ans =stairs(n);
        System.out.println(ans);

    }
        static int stairs(int m){
        if(m<0){
            return 0;
        }
            if (m==0){
                return 1;
            }
        int x=stairs(m-1)+stairs(m-2);
            return x;
    }
}