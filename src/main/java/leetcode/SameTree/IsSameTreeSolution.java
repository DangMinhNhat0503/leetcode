package leetcode.SameTree;


import java.util.ArrayList;
import java.util.List;

public class IsSameTreeSolution {
    //Lời giải chỉ 7 dòng:
    //public boolean isSameTree(TreeNode p, TreeNode q) {
    //        // 1. Nếu cả hai nút cùng là null -> Giống nhau tại vị trí này
    //        if (p == null && q == null) return true;
    //
    //        // 2. Nếu một trong hai bị null (mà đứa kia có giá trị) -> Khác nhau
    //        if (p == null || q == null) return false;
    //
    //        // 3. Nếu giá trị của hai nút khác nhau -> Khác nhau
    //        if (p.val != q.val) return false;
    //
    //        // 4. Nếu nút hiện tại bằng nhau, đệ quy kiểm tra tiếp cây con bên TRÁI và cây con bên PHẢI
    //        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    //    }


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
