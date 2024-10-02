// largest subarray sum less than k

import java.util.Scanner;

public class array2 {
    int ans =0;
    int solution(int[] arr,int K,int N){
       int count =0;
       int j=0;
       int sum=0;
       for(int i=0;i<N;i++){
          sum = sum+arr[i];
          if(sum>=K){
            sum = sum-arr[j];
            j++;
          }

          count =i-j+1;
          ans = Math.max(ans, count);
       }

       return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        array2 ar = new array2();
        System.out.println(ar.solution(arr, K, N));
    }
}
