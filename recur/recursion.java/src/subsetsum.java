public class subsetsum {
    //return the no subsets of an array equal to the given sum
    static int countsubsets(int[] arr, int i,int sum){
        if(sum<0){
            return 0;
        }
        if(sum==0){
            return 1;
        }
        if (i==arr.length) {
            return 0;
        }
       int ans = countsubsets(arr, i+1, sum-arr[i]) + countsubsets(arr, i+1, sum);
       return ans;
    }
    public static void main(String[] args) {
        int[] arr = {20,10,15,5};
        int sum = 25;
        System.out.println(countsubsets(arr, 0, sum));
    }
}
