//program to print subarrays using recursion
public class subarrays {
    static void printArr(int[]arr, int start, int end ){
        if (end==arr.length) {
            return;
            
        }
        else if (start>end) {
            printArr(arr, 0, end+1);
            
        }
        else{
            System.out.print("[");
            for (int i = start; i <= end; i++) {
                 System.out.print(arr[i]+" "); 
                
                }
                
                
            
            
            System.out.println("]");
            printArr(arr, start+1, end);
        }
        }
        
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArr(arr, 0, 0);
    }
}
