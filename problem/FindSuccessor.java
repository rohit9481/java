import java.util.*;

public class FindSuccessor {
//    public TreeNode findSuccessor(TreeNode root, int key){
//        if(root ==  null){
//            return null;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();   //incomplete
//        queue.offer(root);
//
//        while(!queue.isEmpty()){
//            int levelsize = queue.size();
//            TreeNode current = queue.poll();
//
//            if(current.left !=null) {
//                queue.offer(current.left);
//            }
//            if(current.right !=null){
//                queue.offer(current.right);
//            }
//
//            if(current.val = key){
//                break;
//            }
//        }
//        return result;
//    }
//
}

/*
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            result.add(level);
        }

        return result;
    }
}

 */
