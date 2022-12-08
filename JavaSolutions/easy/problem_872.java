package JavaSolutions.easy;

import java.util.Arrays;

public class problem_872 {

    public int[] getSequence(TreeNode root) {
        if (root == null) {
            return new int[] {};
        }

        if (root.left == null && root.right == null) {
            return new int[] { root.val };
        }

        int[] left = getSequence(root.left);
        int[] right = getSequence(root.right);
        int[] result = new int[left.length + right.length];

        for (int i = 0; i < left.length; i++) {
            result[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            result[i + left.length] = right[i];
        }
        return result;
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        int[] seq1 = getSequence(root1);
        int[] seq2 = getSequence(root2);

        return Arrays.equals(seq1, seq2);
    }

    // main method
    public static void main(String[] args) {
        problem_872 solution = new problem_872();
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        System.out.println(solution.leafSimilar(root1, root2));
    }
}
