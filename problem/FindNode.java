//// TreeNode class
//class TreeNode {
//    int val;
//    TreeNode left, right;
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//}
//
//// Solution class with findNode method
//class Solution {
//    TreeNode findNode(TreeNode node, int x) {
//        if (node == null) return null;
//
//        if (node.val == x) return node;
//
//        TreeNode n = findNode(node.left, x);
//        if (n != null) return n;
//
//        return findNode(node.right, x);
//    }
//}
//
//// Public class matching the file name
//public class FindNode {
//    public static void main(String[] args) {
//        // Build a simple tree
//        //       1
//        //      / \
//        //     2   3
//        //    / \
//        //   4   5
//
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        Solution sol = new Solution();
//        int target = 5;
//
//        TreeNode result = sol.findNode(root, target);
//
//        if (result != null) {
//            System.out.println("Found node with value: " + result.val);
//        } else {
//            System.out.println("Node not found.");
//        }
//    }
//}
