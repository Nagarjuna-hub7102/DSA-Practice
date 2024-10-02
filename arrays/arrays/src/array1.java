//find the count of the elements which are greater than its prior elements
/*arr = {7,4,8,2,9}
 count = 3;
 7
 8>4,7
 9>2,8,4,7
 */

import java.util.Scanner;

public class array1 {
    static int count =1;
    static int solution(int[] arr,int N){
       int largest = arr[0];
       for (int i = 0; i < N; i++) {
         if(arr[i]>largest){
            count++;
            largest= arr[i];
         }
       }

       return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr,N));
    }
}
