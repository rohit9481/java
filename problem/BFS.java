import java.util.Queue;
import java.util.LinkedList;

public class BFS {

    static class tree{
        int val;
        tree left;
        tree right;

        tree(int x){
            val = x;
        }
    }
    public static void main(String[] args) {
       tree root = new tree(1);

       root.left = new tree(2);
       root.right = new tree(3);

        root.left.left = new tree(4);
        root.left.right = new tree(5);

        root.right.left = new tree(6);
        root.right.right = new tree(7);

        root.left.left.left = new tree(8);
        root.left.left.right = new tree(9);

        root.right.left.right = new tree(10);
        root.right.right.right = new tree(11);

        //printTree(root);
        Queue<tree> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            tree current = q.poll();
            System.out.println(current.val+ " ");

            if(current.left != null){
                q.add(current.left);
            }

            if(current.right != null){
                q.add(current.right);
            }
        }


    }
    public static void printTree(tree node){
        if(node == null) return;

        System.out.println(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }
}
