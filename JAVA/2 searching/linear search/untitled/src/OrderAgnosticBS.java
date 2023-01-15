
public class OrderAgnosticBS {
    public static void main(String[] args) {

        int [] arr ={1,2,10,15,18,22,25,36,45,47,50,55,56,60};
            int target=60;
               int ans = OrderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int [] arr,int target){

          int start =0;
          int end = arr.length-1;

        boolean isASC = arr[start]<arr[end];
            while (start<=end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                }
                if (isASC) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }

            }
        return  -1;
    }
}
