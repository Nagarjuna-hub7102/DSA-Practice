import java.util.ArrayList;
import java.util.List;

public class subsetsum_2 {
    //return the sunsets of an array that equals to the given target
    static void subsets(int[] arr,int sum,int i,List<Integer> subset){
        if(sum==0){
            System.out.print("[");
            for (int j = 0; j < subset.size(); j++) {
                System.out.print(subset.get(j)+" ");
            }
            System.out.print("]");
            return;

        }
        if (sum<0){
            return;
        }
        if (i==arr.length) {
            return;
        }
        if (arr[i]<=sum) {
            subset.add(arr[i]);
            subsets(arr, sum-arr[i], i+1, subset);
            subset.remove(subset.size()-1);
        }
        subsets(arr, sum, i+1, subset);
    }
    public static void main(String[] args) {
        int[] arr = {20,10,15,5};
        int sum = 25;
        List<Integer> subset = new ArrayList<Integer>();
        subsets(arr, sum, 0, subset);
            
        
        
    }
}
