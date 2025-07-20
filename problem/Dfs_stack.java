import org.w3c.dom.Node;

import java.util.Stack;

public class Dfs_stack {
    void dfs_stack(Node node){
        if(node == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            Node removed = stack.pop();
            System.out.println(removed.val + " ");
            if(removed.right != null){
                stack.push(removed.right);
            }
            if(removed.left != null){
                stack.push(removed.left);
            }

        }

    }
}
