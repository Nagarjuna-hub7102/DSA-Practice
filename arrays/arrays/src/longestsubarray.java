//length of the longest subarray with at most frequency k

import java.util.HashMap;
import java.util.Map;

public class longestsubarray {
    public static int maxsubarraylength(int[] arr, int k){
        Map<Integer,Integer> frequency = new HashMap<>();
        int max_length = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            frequency.put(arr[end],frequency.getOrDefault(arr[end],0)+1);
            while (frequency.get(arr[end])>k) {
                start++;
                frequency.put(arr[start],frequency.getOrDefault(arr[start],0 )-1 );
            }
            max_length=Math.max(max_length, end-start+1);
        }
        return max_length;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2,3,1,2,3};
        int k = 2;
        System.out.println(maxsubarraylength(arr, k));
    }
}
