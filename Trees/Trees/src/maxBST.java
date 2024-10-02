import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class maxBST {
   public class TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode(int val){
            this.value = val;
        }
    }
    public maxBST(){

    } static private TreeNode root;
    public void insert(int value){
        root= insert(root,value);
    }
    private TreeNode insert(TreeNode node ,int value){
        if(node==null){
             node = new TreeNode(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(node.left, value);
        }
        if(value>node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }
    
    public  List<Integer> levelMaxEle(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int max = Integer.MIN_VALUE;
            int levelsize = q.size();
            for(int i = 0;i<levelsize; i++){
                TreeNode current = q.poll();
                max = Math.max(max, current.value);
                if (current.left!=null) {
                    q.add(current.left);
                }
                if (current.right!=null) {
                    q.add(current.right);
                }
            }
            result.add(max);
        }
        return result;
    }
    public static void main(String[] args) {
        maxBST tree = new maxBST();
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(6);
        tree.insert(3);
        tree.insert(5);
        System.out.println(tree.levelMaxEle(root));
        
    }
}
