
public class search {

    public static void main(String[] args) {

        int[] arr = {1, -5, -3, 5, 2, 8, -7, 89, 6};
        int ans = Search(arr);
        System.out.println(ans);
    }

    static int Search(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans) {
               ans= i;
            }
        }
            return ans ;
    }
}
