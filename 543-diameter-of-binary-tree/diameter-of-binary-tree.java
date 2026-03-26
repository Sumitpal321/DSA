class Solution {
    static int maxDia;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftlevel = levels(root.left);
        int rightlevel = levels(root.right);
        int dia = leftlevel + rightlevel;
        maxDia = Math.max(dia, maxDia);
        return 1 + Math.max(leftlevel, rightlevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        levels(root);
        return maxDia;
    }
}