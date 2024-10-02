//find the no of subarrays product less than k
public class subarrayproduct {
    public int subarrayProductlessthan(int[] arr, int k){
          int result = 0;
          int left = 0;
          int product = 1;
          for (int i = 0; i < arr.length; i++) {
            product = product*arr[i];
            while(product>=k && left<=i){
                product = product/arr[left];
                left++;
            }
            result = result+i-left+1;
          }
          return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 12;
        subarrayproduct s = new subarrayproduct();
        System.out.println("No of subarrays product less than "+k+"is:"+" "+s.subarrayProductlessthan(arr,k));
    }
}
