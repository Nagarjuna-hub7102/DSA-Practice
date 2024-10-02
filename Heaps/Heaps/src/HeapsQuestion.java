import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;



public class HeapsQuestion {
    

  //  https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/0
    //Function to return the minimum cost of connecting nodes..
    long minCost(long arr[], int n) 
    { 
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        long cost = 0;
        while(pq.size()>1){
            long min1 = pq.remove();
            long min2 = pq.remove();
            pq.add(min1+min2);
            cost = cost+min1+min2;
        }
        
        return cost;
    
    }




//https://www.geeksforgeeks.org/problems/min-sum-formed-by-digits3551/0
    public static long minSum(int arr[], int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        boolean check = false;
        long num1 = 0;
        long num2 = 0;
        while(!pq.isEmpty()){
           if(check){
               num1 = num1*10+pq.poll();
           } 
           else{
               num2 = num2*10+pq.poll();
           }
           check = !check;
        }
       
       return num1+num2;
    }



    

//https://www.geeksforgeeks.org/problems/merge-two-binary-max-heap0144/0

    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] c = new int[n+m];
        for(int i=0;i<n;i++){
            pq.add(a[i]);
        }
        
        for(int i=0;i<m;i++){
            pq.add(b[i]);
        }
        
        int i=n+m-1;
        while(!pq.isEmpty()){
           c[i] = pq.poll();
           i--;
        }
        
       return c; 
        
    }


    //https://www.geeksforgeeks.org/problems/chinky-and-diamonds3340/0

    static long maxDiamonds(int[] A, int N, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            pq.add(A[i]);
        }
        
        long ans=0;
        while(K>0){
            int a = pq.remove();
            ans = ans+a;
            pq.add(a/2);
            K--;
            
        }
        
        return ans;
    }


    //https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/0

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}


    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {   
        return (helper(root,K).data);
    }
    int count = 0;
    public Node helper(Node root,int k){
        if(root==null){
            return null;
        }
        Node right = helper(root.right,k);
        if(right!=null){
            return right;
        }
        count++;
        if(count==k){
            return root;
        }
        return helper(root.left,k);
    }



    
//https://www.geeksforgeeks.org/problems/k-largest-elements3736/0

    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            pq.offer(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        
        while(!pq.isEmpty()){
            list.add(0,pq.poll());
        }
        
        return list;
    }


    //https://www.geeksforgeeks.org/problems/sum-of-elements-between-k1th-and-k2th-smallest-elements3133/0

    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0;i<A.length;i++){
            pq.add(A[i]);
        }
        long sum= 0;
        while(pq.size()>0){
            if(K1>0){
                pq.poll();
                K1--;
                K2--;
                continue;
            }
            
            if(K2==1){
                break;
            }
            
            
            sum = sum+pq.poll();
            K2--;
            
        }
        
        return sum;
    }


    



    





}

