public class arrayrev {
     static void reverse(int[] nums,int start, int end){
        int mid = (start+end)/2;
        
        for(int i=0;i<=mid;i++){
             int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[i];
        }
}
public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};
    int n = nums.length;
    reverse(nums, 0, n-1);
}
}
