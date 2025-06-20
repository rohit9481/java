//class BST {
//    public class node {
//        private int value;
//        private int height;
//        private Node left;
//        private Node right;
//
//        public Node(int value) {
//            this.value = value;
//        }
//
//        public int getValue() {
//            return value;
//
//        }
//    }
//    private node root;
//
//    public BST() {
//    }
//
//    public int height(Node node) {
//        if (node == null) {
//                return -1;
//            }
//            return node.height;
//    }
//
//    public boolean isEmpty() {
//        return root == null;
//    }
//    /* insert from here */
//    public void insert(int value){
//
//    }
//    private Node insert(int value, Node node){
//
//        if(node == null) {
//            node = new Node(value);
//            return node;
//        }
//
//        if(value < node.value){
//            node.left = insert(value,node.left);
//
//        }if(value < node.value){
//            node.right = insert(value,node.right);
//
//        }
//        node.height = math.max(height(node.left),height((node.right)) +1);
//        return node;
//    }
//
//    public void display() {
//        display(root, "root node: ");
//    }
//
//    private void display(Node node, String details) {
//        if (node == null) {
//            return;
//        }
//        System.out.println(details + node.getValue());
//    }
//
//    display(node.left,"Left chile of " + node.getValue() +" : ");
//    display(node.right,"right chile of " + node.getValue() +" : ");
//
//
//}
