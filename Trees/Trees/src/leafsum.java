public class leafsum {
    TreeNode root;
    int ans;
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }


        static int n = 0;
       static public int sumNumbers(TreeNode root) {
             if(root==null){
                 return 0;
             }
             n = n*10+root.val;
             int left = sumNumbers(root.left);
             int right = sumNumbers(root.right);
             if(left==0&&right==0){
                return n;
             }else{
                return left+right;
             }
         }

         public static void main(String[] args) {
            leafsum tree = new leafsum();
            tree.root = tree.new TreeNode(4);
		    tree.root.left = tree.new TreeNode(9);
		    tree.root.right = tree.new TreeNode(0);
		    tree.root.left.left = tree.new TreeNode(5);
		    tree.root.left.right = tree.new TreeNode(1);
            tree.ans = sumNumbers(tree.root);
            System.out.println(tree.ans);
		    

         }
}
