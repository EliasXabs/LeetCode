package JavaSolutions.medium;

import JavaSolutions.TreeNode;

public class problem_1026 {
    public int traverse(TreeNode root, int max, int min) {
        int dif = Math.abs(max - min);
        if (root == null) {
            return 0;
        }
        if (Math.abs(root.val - min) > dif && Math.abs(root.val - max) < Math.abs(root.val - min)) {
            dif = Math.abs(root.val - min);
            max = root.val;
        } else if (Math.abs(root.val - max) > dif) {
            dif = Math.abs(root.val - max);
            min = root.val;
        }
        int i;
        if ((i = traverse(root.left, max, min)) > dif) {
            dif = i;
        }
        if ((i = traverse(root.right, max, min)) > dif) {
            dif = i;
        }

        return dif;

    }

    public int maxAncestorDiff(TreeNode root) {
        int maxDif = 0;
        if (root == null) {
            return maxDif;
        }
        maxDif = traverse(root, root.val, root.val);
        return maxDif;
    }

    // main method
    public static void main(String[] args) {
        problem_1026 solution = new problem_1026();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(0);
        root.left.right = new TreeNode(10);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(1);
        root.right.right.right = new TreeNode(6);
        root.right.right.right.left = new TreeNode(9);
        System.out.println(solution.maxAncestorDiff(root));
    }
}
