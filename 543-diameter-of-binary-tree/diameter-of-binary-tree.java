class Solution {
    public int levels(TreeNode root, int [] dia){
        if(root == null) return 0;
        int leftlevels = levels(root.left, dia);
        int rightlevels = levels(root.right, dia);
        int path = leftlevels + rightlevels;
        dia[0] = Math.max(dia[0], path);
        return 1 + Math.max(leftlevels, rightlevels);
    }
    public int diameterOfBinaryTree(TreeNode root){
        int [] dia = {0};
        levels(root, dia);
        return dia[0];
    }
}