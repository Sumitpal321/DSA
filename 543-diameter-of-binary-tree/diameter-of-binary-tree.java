class Solution {
    static Map<TreeNode, Integer> dp;
    public int levels(TreeNode root){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);
        dp.put(root, 1 + Math.max(leftlevels , rightlevels));
        return dp.get(root);
    }
    public int diameter(TreeNode root){
        if(root==null) return 0;
        int mydia = levels(root.left) + levels(root.right);
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        return Math.max(mydia, Math.max(leftDia, rightDia));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dp = new HashMap<>();
        return diameter(root);
    }
}