import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesums {
    
    public List<List<Integer>> threeSum(int[] nums) {
        return helper(nums,0);
    }
    public List<List<Integer>> helper(int[] nums,int targetsum){
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            
            int required = targetsum - nums[i];
            int l = i+1;
            int r = nums.length-1;
            while(r>l){
                int sum = nums[l]+nums[r];
                if(sum>required){
                    r--;
                }
                if(sum<required){
                    l++;
                }
                if(sum==required){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
                
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-4,-1};
        threesums sum = new threesums();
        System.out.println(sum.threeSum(nums));
    }
}
            

