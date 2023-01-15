
public class Main{
    public static void main(String[] args) {
        int base =2;
        int p=5;
        int ans = rpower(base , p);
        System.out.println(ans);

    }

     static int rpower(int base , int num) {

        if(num>=1){
            int i = num - 1;
            return base*rpower(base,num-1);
        }
                else return 1;

    }

}