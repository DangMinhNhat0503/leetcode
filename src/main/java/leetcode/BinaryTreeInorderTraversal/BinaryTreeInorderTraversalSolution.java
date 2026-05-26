package leetcode.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalSolution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root != null) {
            if (root.left != null && root.right != null) {
                result.addAll(inorderTraversal(root.left));
                result.add(root.val);
                result.addAll(inorderTraversal(root.right));
            }

            if (root.left == null && root.right == null) {
                result.add(root.val);
            }

            if (root.left == null && root.right != null) {
                result.add(root.val);
                result.addAll(inorderTraversal(root.right));
            }

            if (root.left != null && root.right == null) {
                result.addAll(inorderTraversal(root.left));
                result.add(root.val);
            }

            return result;
        }

        return result;
    }
}
