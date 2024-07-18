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
class Solution {
    public int count;

    public List<Integer> fun(TreeNode root, int d) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        }
        List<Integer> left = fun(root.left, d);
        List<Integer> right = fun(root.right, d);
        for (int num : left) {
            for (int num2 : right) {
                if ((num + num2) <= d) {
                    count++;
                }
            }
        }
        List<Integer> parent = new ArrayList<>();
        for (int num : left) {
            if (num + 1 < d) {
                parent.add(num + 1);
            }
        }
        for (int num : right) {
            if (num + 1 < d) {
                parent.add(num + 1);
            }
        }
        return parent;
    }

    public int countPairs(TreeNode root, int distance) {
        count = 0;
        fun(root, distance);
        return count;
    }
}