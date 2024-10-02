import java.util.ArrayList;
import java.util.List;

public class duplicates {
   /*  static void sort(int[] arr,int n){
        int i = 0;
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
             
    }
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void printduplicates(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr[i]-1){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("]");
    } */
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int n = arr.length;
        duplicates a = new duplicates();
        System.out.println(a.findduplicates(arr, n));
       /*  sort(arr, n);
        print(arr);
        printduplicates(arr); */
    }
    public  List<Integer> findduplicates(int[] arr, int n){
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]);
            int index = num-1;
            if(arr[index]<0){
                result.add(num);
            }
            arr[index]=arr[index]*(-1);

        }
        return result;
    }
}