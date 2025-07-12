public class Sibling {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);

        return (
                (level(root,xx,0) == level<root,yy,0) && (!isSibling(root,xx,yy))
                )
    }

}
