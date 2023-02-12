import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
            int []arr = new int[n];
        System.out.println("enter array");
            for (int i = 0;i< n;i++){
                arr[i] = sc.nextInt();
            }
        System.out.println(Arrays.toString(arr));
           int []brr = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = arr[n-i-1];
            System.out.print(brr[i]+" ");
        }


    }
}
