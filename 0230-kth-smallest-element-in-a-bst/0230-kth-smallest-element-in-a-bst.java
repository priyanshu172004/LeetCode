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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, k, result);
        return result.get(k - 1);
    }
    public void inorderTraversal(TreeNode root, int k, List<Integer> result){
        if(root == null){
            return;
        }
        inorderTraversal(root.left, k, result);
        result.add(root.val);
        inorderTraversal(root.right, k, result);
    }
}