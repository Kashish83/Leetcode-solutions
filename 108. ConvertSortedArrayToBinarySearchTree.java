class TreeNode {
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
class Solution {
    public  TreeNode helper(int[] nums, int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=helper(nums,st,mid-1);

        root.right=helper(nums,mid+1,end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return helper(nums,0,n-1);
    }
}
