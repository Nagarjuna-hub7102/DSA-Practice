//subarrays with k different integers
//find the no of subarrays with k different integers

import java.util.HashMap;

public class subarrays_k {
    static int subarrayswithAtmostkdistint(int[] arr,int k){
        int start = 0;
        int count = 0;
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for (int end = 0; end < arr.length; end++) {
            frequency.put(arr[end],frequency.getOrDefault(arr[end],0)+1);
            while (frequency.size()>k) {
                frequency.put(arr[start],frequency.get(arr[start])-1);
                if (frequency.get(arr[start])==0) {
                    frequency.remove(arr[start]);
                }
                start++;
            }
            count += end-start+1;
        }
        return count;
    }
    static int subarrayswithkdistint(int[] arr, int k){
        return subarrayswithAtmostkdistint(arr, k)-subarrayswithAtmostkdistint(arr, k-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int k=2;
        System.out.println(subarrayswithkdistint(arr, k));
    }
}
