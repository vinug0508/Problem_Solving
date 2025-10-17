/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair{
    TreeNode node;
    int ind;

    public Pair(TreeNode node, int ind){
        this.node=node;
        this.ind=ind;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans=0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            int size=q.size();
            int mmin = q.peek().ind;
            int first=0;
            int last=0;

            for(int i=0;i<size;i++){
                int curr_ind = q.peek().ind - mmin;
                TreeNode node = q.peek().node;
                q.poll();

                if(i==0) first=curr_ind;
                if(i==size-1) last=curr_ind;

                if(node.left!=null){
                    q.offer(new Pair(node.left, curr_ind*2+1));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right, curr_ind*2+2));
                }
            }
            ans=Math.max(ans, last-first+1);
        }
        return ans;
    }
}