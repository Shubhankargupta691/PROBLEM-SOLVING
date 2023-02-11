import java.util.*;
public class CollegeOnHills{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int N = sc.nextInt();
        int []arr = new int[N];

        System.out.println( findWater(N,arr));
    }

    static int findWater(int n,int[]arr) {
        Scanner sc = new Scanner(System.in);
        int water =0;
        System.out.println("enter array");
        for (int i= 0;i< n;i++ ){
            arr[i] = sc.nextInt();
        }
          int []left = new int[n];
            left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1],arr[i]);
        }
        int []right = new int[n];
        right[n-1] = arr[n-1];
        for (int j = n-2 ; j >= 0 ; j--) {
            right[j] = Math.max(right[j + 1], arr[j]);
        }
        for(int i = 0;i< n;i++){

            water += Math.min(left[i],right[i])- arr[i];
        }
        return water;
    }
}