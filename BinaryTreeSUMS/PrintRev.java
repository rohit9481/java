import java.util.*;

public class PrintRev {
    public static void main(String[] args) {
        // Create a sample binary tree:
        //         1
        //        / \
        //       2   3
        //      /   / \
        //     4   5   6

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Solution sol = new Solution();
        List<List<Integer>> result = sol.levelOrderBottom(root);

        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelsize; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            result.add(0,level); // Add at beginning for bottom-up order
        }

        return result;
    }
}
