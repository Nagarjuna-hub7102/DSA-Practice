//count the no of subarrays where max element appears k times
public class subarray {
    static int countSubarrays(int[] arr,int k){
       int max_element = findmaxele(arr);
       int count = 0;
       int count_max = 0;
       for (int start = 0; start < arr.length-k+1; start++) {
        if(arr[start]==max_element){
            count_max++;
        }
            for (int end = start+1; end < arr.length; end++) {
                if(arr[end]==max_element){
                    count_max++;
                }
                if(count_max==k){
                    count++;
                }
                if(count_max>k){
                    count++;
                    count_max=0;
                }
            }
        }
       
       return count;
    }
    static int findmaxele(int[] arr){
         int max_element = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max_element){
                max_element=arr[i];
            }
         }
         return max_element;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,3};
        int k = 2;
        System.out.println(countSubarrays_2(arr, k));
    }





    //whenever  the question says subarray we should use sliding window technique
    static int countSubarrays_2(int[] arr,int k){
        int max_element = findmaxele(arr);
        int start = 0;
        int ans = 0;
        int frequency = 0;
        for (int end = 0; end < arr.length; end++) {
            if(arr[end]==max_element){
                frequency++;
            }
            while (frequency==k) {
                if(start==max_element){
                   frequency--;
                   
                }
                start++;
               
            }
            ans = ans+start;
    }
    return ans;
}
}
