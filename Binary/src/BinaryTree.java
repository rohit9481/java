import java.util.Scanner;

class BinaryTree {

    public BinaryTree(){
        
    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }

    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("enter the root node value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("do u want to enter left"+ node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter left node value: " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("do u want to enter right"+ node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter right node value: " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

}
