import java.util.*;

class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return search(root, k, set);
    }

    private boolean search(TreeNode root, int k, HashSet<Integer> set) {
        if (root == null) return false;

        if (set.contains(k - root.val)) return true;

        set.add(root.val);

        return search(root.left, k, set) ||
               search(root.right, k, set);
    }
}