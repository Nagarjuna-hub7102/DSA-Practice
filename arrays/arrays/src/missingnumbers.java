//find the least positive missing number in array
public class missingnumbers {
    static int getMissing(int[] arr, int n){
        int i=0;
        while (i<n) {
            int index = arr[i]-1;
            if (index>=0&&index<arr.length&&arr[i]!=arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j!=arr[j]-1) {
                return j+1;

                
            }
            
        }
        return arr.length;

    }
    public static void main(String[] args) {
        int[] arr = {9,8,2,3,4,1,6};
        int n = arr.length;
        System.out.println("missing number:"+" "+getMissing(arr, n));
    }
}
