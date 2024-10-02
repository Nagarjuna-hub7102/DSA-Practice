import java.util.Arrays;
//find the subarray of size equal to the given target
public class threesum {
    static boolean threesumexists(int[] arr, int n, int target){
        int sum;
        int l, r;
        for (int i = 0; i < arr.length - 2; i++) {
            l = i + 1;
            r = arr.length - 1;
            while (l<r) {
                sum = arr[i] + arr[l] + arr[r];
                if (sum == target ) {
                    System.out.println(arr[i]+"   "+arr[l]+"    "+arr[r]);
                    return true;
                    
                }
                else{
                    if(sum > target){
                        r--;
                    }
                    else{
                        l++;
                    }
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int n = arr.length;
        int target = 22;
        Arrays.sort(arr);
        threesumexists(arr, n, target);
    }
    
}
