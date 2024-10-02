import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class TreeQuestionsGFG {
    //https://www.geeksforgeeks.org/problems/odd-even-level-difference/0

    class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


	int getLevelDiff(Node root)
	{
	    int sum1 = 0;
	    int sum2 = 0;
	    int level = 0;
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    while(!q.isEmpty()){
	        int levelSize = q.size();
	        for(int i=0;i<levelSize;i++){
	            Node current = q.poll();
	            if(level%2==0){
	                sum1 = sum1+current.data;
	            }
	            else{
	                sum2 = sum2+current.data;
	            }
	            if(current.left!=null){
	                q.add(current.left);
	            }
	            if(current.right!=null){
	                q.add(current.right);
	            }
	        }
	        level++;
	    }
	    return sum1-sum2;
	}


	//https://www.geeksforgeeks.org/problems/ancestors-in-binary-tree/0

	 ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> Ancestors(Node root, int target)
    {
       helper(root,target);
       return result;
    }
    Node helper(Node root,int target){
        if(root==null){
            return null;
        }
        if(root.data==target){
            return root;
        }
        Node left = helper(root.left,target);
        Node right = helper(root.right,target);
        if(left!=null||right!=null){
            result.add(root.data);
        }
        
        if(left==null&&right==null){
            return null;
        }
        
        return root;
            
    }


	//https://www.geeksforgeeks.org/problems/largest-value-in-each-level/0

	public ArrayList<Integer> largestValues(Node root)
    {   ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            int max = 0;
            for(int i=0;i<levelsize;i++){
                Node current = q.poll();
                if(current.data>max){
                    max = current.data;
                }
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
                
            }
            ans.add(max);
        }
        return ans;
    }


}
