class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null){
            return targetSum == root.val;
        }
        int remainingSum = targetSum - root.val;
        boolean left = hasPathSum(root.left, remainingSum);
        boolean right = hasPathSum(root.right, remainingSum);
        return left || right;
    }
}