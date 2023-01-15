public class Main {
    public static void main(String[] args) {

        String [] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n=412;
        digit(n,arr);
    }

    static void digit(int m,String [] arr){
        if(m==0){
            return ;
        }
        int num=m%10;
        m=m/10;

        digit(m,arr);
        System.out.print(arr[num]+" ");
    }
}