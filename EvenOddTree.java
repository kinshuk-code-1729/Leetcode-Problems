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
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null){
            return true;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean levelEven = true;

        while(q.size() > 0){
            int l = q.size();
            int prev = levelEven ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            while(l > 0){
                root = q.poll();
                if(levelEven && (root.val % 2 == 0 || root.val <= prev)){
                    return false;
                }
                if(!levelEven && (root.val % 2 == 1 || root.val >= prev)){
                    return false;
                }
                prev = root.val;

                if(root.left != null){
                    q.add(root.left);
                }
                if(root.right != null){
                    q.add(root.right);
                }
                l--;
            }
            levelEven = !levelEven;
        }
        return true;
    }
}
