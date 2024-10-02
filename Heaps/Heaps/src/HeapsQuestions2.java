import java.util.ArrayList;
import java.util.PriorityQueue;

public class HeapsQuestions2 {
    //https://www.geeksforgeeks.org/problems/k-largest-elements4206/0


    int[] kLargestEle(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[]  ans = new int[k];
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        
        for(int i=k;i<n;i++){
            if(pq.peek()<arr[i]){
                pq.add(arr[i]);
                pq.remove();
            }
    }
    int i=k-1;
    while(!pq.isEmpty()){
        int a = pq.poll();
        ans[i--]= a;
    }
    
    return ans;
}


//https://www.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/0

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

 //Function to merge K sorted linked list.
 Node mergeKList(Node[]arr,int K)
 {
     Node head = null;
     Node temp1 = null;
     Node temp2 = null;
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     int i=0;
     while(i<K){
         temp1 = arr[i];
         while(temp1!=null){
             pq.add(temp1.data);
             temp1= temp1.next;
         }
         i++;
     }
     
     while(!pq.isEmpty()){
         Node l = new Node(pq.poll());
         if(head==null){
             head = l;
             temp2=head;
         }
         else{
             temp2.next=l;
             temp2 = temp2.next;
         }
     }
     
     
     return head;
 }

//https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/0

  //Function to merge k sorted arrays.
  public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
  {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      ArrayList<Integer> list = new ArrayList<>();
      for(int i=0;i<K;i++){
          for(int j=0;j<K;j++){
              pq.add(arr[i][j]);
          }
      }
      
      
      while(!pq.isEmpty()){
          int ele = pq.poll();
          list.add(ele);
      }
      
      
      return list;
      
      
  }
}
