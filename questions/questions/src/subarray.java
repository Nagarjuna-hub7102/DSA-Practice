//find the subarray with sum is equalto zero
public class subarray {
    public  boolean subarrayexits( int[] arr,int n){
        
         for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if(sum == 0){
             return true;
         }
         else{
        
            for (int j = i + 1; j < n; j++) {
               sum += arr[j];
               if(sum == 0){
                System.out.println("indices from"+ i + "to" + j );
                return true;
            }
               
            }
        }
            
         }
        
        return false;




    }
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int n = arr.length;
        subarray s = new subarray();
        s.subarrayexits(arr, n);
        /*if(subarrayexits(arr, n)){
            System.out.println("subarray exists");
            
    
        }
           /*else{ System.out.println("subarray not existed");}*/
        
    }
}
