package JavaSolutions.easy;

public class problem_938 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        sum += rangeSumBST(root.right, low, high);
        sum += rangeSumBST(root.left, low, high);
        return sum;
    }

    // main method
    public static void main(String[] args) {
        problem_938 solution = new problem_938();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        System.out.println(solution.rangeSumBST(root, 7, 15));
    }
}
