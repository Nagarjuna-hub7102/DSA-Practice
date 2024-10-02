//program to find the unique numbers in an array
public class uniquenumbers {
    static void printunique(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
            
        }
        sum = (sum&-sum);
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & sum)>0) {
                sum1=sum^sum1;
                
            }
            else{
                sum2=sum2^arr[i];
            }
            
        }
        System.out.println("The non-repeating elements are "
        + sum1 + " and " + sum2);
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 7, 9, 11, 2, 3, 11 };
        
         printunique(arr);
    }
}
