import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class TreeQuestions2GFG {
    class Node
{
    int data;
    Node left, right;
    Node nextRight;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
    //https://www.geeksforgeeks.org/problems/sum-tree/0

    boolean isSumTree(Node root)
	{
       if(root==null||root.left==null&&root.right==null){
           return true;
       }
       return root.data==sum(root.left)+sum(root.right)&&isSumTree(root.left)&&isSumTree(root.right);
	}
	
	
	int sum(Node root){
	    if(root==null){
	        return 0;
	    }
	    return root.data+sum(root.left)+sum(root.right);
	}


    //https://www.geeksforgeeks.org/problems/connect-nodes-at-same-level/0

     //Function to connect nodes at same level.
    public void connect(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            Node prev = null;
            for(int i=0;i<levelsize;i++){
                Node current = q.poll();
                if(i!=0){
                    prev.nextRight = current;
                }
                prev = current;
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            prev.nextRight = null;
        }
    }



    //https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/0

    
    int findDist(Node root, int a, int b) {
        Node p = lca(root,a,b);
        return dfs(p,a)+dfs(p,b);
        
     }
     
     private Node lca(Node root, int p, int q) {
         if (root==null||root.data==p||root.data==q) {
             return root;
         }
         Node left = lca(root.left, p, q);
         Node right = lca(root.right, p, q);
         if (left==null) {
             return right;
         }
         if (right==null) {
             return left;
         }
         return root;
     }
     
     int dfs(Node root,int val){
         if(root==null){
             return -1;
         }
         if(root.data==val){
             return 0;
         }
         int left = dfs(root.left,val);
         int right = dfs(root.right,val);
         if(left==-1&&right==-1){
             return -1;
         }
         return Math.max(left,right)+1;
     }



     //https://www.geeksforgeeks.org/problems/check-if-subtree/0

     public static boolean isSubtree(Node T, Node S) {
        if(T==null){
            return false;
        }
        if(dfs(T,S)){
            return true;
        }
        return isSubtree(T.left,S)||isSubtree(T.right,S);
    }
    static boolean dfs(Node T,Node S){
        if(T==null&&S==null){
            return true;
        }
        if(T==null||S==null){
            return false;
        }
        return T.data==S.data&&dfs(T.left,S.left)&&dfs(T.right,S.right);
    }


    //https://www.geeksforgeeks.org/problems/largest-bst/0

    private int ans;
    
    // Return the size of the largest sub-tree which is also a BST
    public int largestBst(Node root)
    {
        ans= 0;
        dfs(root);
        return ans;
    }
    
    private int[] dfs(Node root) {
        if (root == null) {
            return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        if (left[1] < root.data && root.data < right[0]) {
            ans = Math.max(ans, left[2] + right[2] + 1);
            return new int[] {
                Math.min(root.data, left[0]), Math.max(root.data, right[1]), left[2] + right[2] + 1};
        }
        return new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
    }



    //https://www.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/0

    HashSet<Integer> hs = new HashSet<>();
    public int isPairPresent(Node root, int target)
    {
       if(root==null){
           return 0;
       }
       int left=isPairPresent(root.left,target);
       int right=isPairPresent(root.right,target);
       
       if(left!=0||right!=0){
           return 1;
       }
       
       int sum = target-root.data;
       if(hs.contains(sum)){
           return 1;
       }
       else{
           hs.add(root.data);
       }
       
       
       
       return 0;
        
    }


    //https://www.geeksforgeeks.org/problems/preorder-to-postorder4423/0

    public static Node post_order(int pre[], int size) 
{
   return helper(pre,0,size-1);
} 
  static Node helper(int[] pre,int start,int end){
        if(start>end){
            return null;
        }
        Node root = new Node(pre[start]);
        int i;
        for(i=start;i<=end;i++){
            if(pre[i]>root.data){
                break;
            }
        }
        root.left = helper(pre,start+1,i-1);
        root.right = helper(pre,i,end);
        
        return root;
    }


    //https://www.geeksforgeeks.org/problems/preorder-traversal-and-bst4006/0

    static int canRepresentBST(int arr[], int N) {
        if(!canBST(arr,N)){
            return 0;
        }
        return 1;
    }
    static boolean canBST(int pre[], int n) { 
        
        Stack<Integer> s = new Stack<Integer>(); 
   
        
        int root = Integer.MIN_VALUE; 
   
        
        for (int i = 0; i < n; i++) { 
            
            if (pre[i] < root) { 
                return false; 
            } 
   
            
            while (!s.empty() && s.peek() < pre[i]) { 
                root = s.peek(); 
                s.pop(); 
            } 
   
    
            s.push(pre[i]); 
        } 
        return true; 
    } 

    
//2nd approach... 
/*static boolean helper(int arr[],int start,int end){
        if(start>end){
            return true;
        }
       int j = nextGreater(arr,start+1,end,arr[start]);
       int root = arr[start];
       for(int k=j;k<=end;k++){
           if(arr[k]<root){
               return false;
           }
       }
       
       return helper(arr,start+1,j-1)&&helper(arr,j,end);
    }
    
    
    static int nextGreater(int arr[],int start,int end,int key){
        int i;
        for( i=start;i<=end;i++){
            if(arr[i]>key){
                break;
            }
        }
       return i; 
    }*/




    //https://www.geeksforgeeks.org/problems/preorder-traversal-iterative/0

     // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
       ArrayList<Integer> ans = new ArrayList<>();
       Stack<Node> s = new Stack<>();
       s.push(root);
       while(!s.isEmpty()){
           Node popped = s.pop();
           ans.add(popped.data);
           if(popped.right!=null){
               s.push(popped.right);
           }
           if(popped.left!=null){
               s.push(popped.left);
           }
       }
       return ans;
    }



    //https://www.geeksforgeeks.org/problems/single-valued-subtree/0


    int count = 0;
    public int singlevalued(Node root)
    {
        dfs(root,root.data);
        return count;
    }
    public boolean dfs1(Node root,int a){
        if(root==null){
            return true;
        }
        boolean left = dfs1(root.left,root.data);
        boolean right = dfs1(root.right,root.data);
        if(left&&right){
            count++;
        }
        return left&&right&&a==root.data;
        
    }



    //https://www.geeksforgeeks.org/problems/construct-binary-tree-from-parent-array/0

      //Function to construct binary tree from parent array.
    public static Node createTree(int parent[], int N)
    {
       Map<Integer,Node> mp = new HashMap<>();
       for(int i=0;i<N;i++){
           mp.put(i,new Node(i));
       }
       Node root = null;
       
       for(int i=0;i<N;i++){
           if(parent[i]==-1){
               root = mp.get(i);
           }
           else{
               Node ptr = mp.get(parent[i]);
               
               if(ptr.left!=null){
                   ptr.right = mp.get(i);
               }
               else{
                   ptr.left = mp.get(i);
               }
           }
       }
       return root;
    }


    //https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/0


    Node lca(Node root, int n1,int n2)
	{
		if(root==null){
		    return null;
		}
		if(root.data==n1||root.data==n2){
		    return root;
		}
		Node left = lca(root.left,n1,n2);
		Node right = lca(root.right,n1,n2);
		if(left!=null&&right!=null){
		    return root;
		}
		return left==null ? right : left;
	}



    //https://www.geeksforgeeks.org/problems/extreme-nodes-in-alternate-order/0

    public  ArrayList<Integer> ExtremeNode(Node root)
      {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        boolean reverse = false;
        q.add(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            for(int i=0;i<levelsize;i++){
                Node popped = q.poll();
                if(reverse&&i==0){
                    ans.add(popped.data);
                }
                else if(!reverse&&i==levelsize-1){
                    ans.add(popped.data);
                }
                if(popped.left!=null){
                    q.add(popped.left);
                }
                if(popped.right!=null){
                    q.add(popped.right);
                }
            }
            reverse = !reverse;
        }
        return ans;
      }



      //https://www.geeksforgeeks.org/problems/construct-tree-1/0

       public static Node buildTree(int inorder[], int preorder[], int n)
    {
        if(preorder.length == 0){
            return null;
        }
        int root = preorder[0];
        Node node = new Node(root);
        int index = 0;
        for(int i = 0;i<inorder.length;i++){
            if(inorder[i]==root){
                index = i;
            }
        }
        node.left = buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(preorder,1,index+1),n);
        node.right = buildTree(Arrays.copyOfRange(inorder,index+1,preorder.length),Arrays.copyOfRange(preorder,index+1,inorder.length),n);
        return node;
    }


    //https://www.geeksforgeeks.org/problems/inorder-traversal-iterative/0


    ArrayList<Integer> inOrder(Node root)
    {   ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Node current = root;
        while(current!=null||s.size()>0){
          while(current!=null){
            s.push(current);
            current = current.left;
          }
        
            Node popped = s.pop();
            ans.add(popped.data);
            current = popped.right;
        }
        return ans;
    }


    //https://www.geeksforgeeks.org/problems/remove-bst-keys-outside-given-range/0

    Node removekeys(Node root, int l, int r) {
        if(root==null){
            return root;
        }
        root.left = removekeys(root.left,l,r);
        root.right = removekeys(root.right,l,r);
        
        if(root.data>r){
            root = root.left;
        }
        else if(root.data<l){
            root = root.right;
        }
        
        return root;
        }    



        //https://www.geeksforgeeks.org/problems/bst-to-greater-sum-tree/0


        int sum = 0;
    public  void transformTree (Node root)
    {
        if(root==null){
            return;
        }
        transformTree(root.right);
        int last = root.data;
        root.data = sum;
        sum = sum+last;
        transformTree(root.left);
    }





}





