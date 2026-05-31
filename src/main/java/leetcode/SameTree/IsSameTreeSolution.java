package leetcode.SameTree;


import java.util.ArrayList;
import java.util.List;

public class IsSameTreeSolution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> array1 = binaryTreeConvertToList(p);
        List<Integer> array2 = binaryTreeConvertToList(q);

        boolean check = true;

        if (array1.size() != array2.size()) {
            return false;
        }

        for (int i = 0; i < array1.size(); i++) {

            if (array1.get(i) == null && array2.get(i) != null) {
                check = false;
                break;
            }

            if (array1.get(i) != null && array2.get(i) == null) {
                check = false;
                break;
            }

            if (array1.get(i) == null && array2.get(i) == null) {
                check = true;
                continue;
            }

            if (!array1.get(i).equals(array2.get(i))) {
                check = false;
                break;
            }
        }

        return check;
    }

    public List<Integer> binaryTreeConvertToList(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root != null) {
            if (root.left != null && root.right != null) {
                result.add(root.val);
                result.addAll(binaryTreeConvertToList(root.left));
                result.addAll(binaryTreeConvertToList(root.right));
            }

            if (root.left == null && root.right == null) {
                result.add(root.val);
            }

            if (root.left == null && root.right != null) {
                result.add(root.val);
                result.add(null);
                result.addAll(binaryTreeConvertToList(root.right));
            }

            if (root.left != null && root.right == null) {
                result.add(root.val);
                result.addAll(binaryTreeConvertToList(root.left));
                result.add(null);
            }

            return result;
        }


        result.add(null);

        return result;
    }
}
