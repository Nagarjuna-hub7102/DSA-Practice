public class nxtgreaterele {
    static void findnxtgreater(int[] arr, int n){
       int j;
        int i;
        for (i = 0; i < arr.length; i++) {
            int next = -1;
             for ( j = i+1; j < arr.length; j++) {
                
            
               if(arr[j] > arr[i]){
                  next = arr[j];
                  break;
                
               }
            }
            System.out.println(arr[i]+"------->"+ next);
               
            
        }
        
    }

   /*private static int findindex(int[] arr, int n, int x) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x)
            return i;
        }
        return -1;
    } */ 
    public static void main(String[] args) {
        int[] arr = {11,13,21,3};
        int n = arr.length;
        findnxtgreater(arr, n);
    }

    
}
