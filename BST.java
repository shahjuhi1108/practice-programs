import java.util.Scanner;

//Recursion method.

class Node {

    private Node left;
    private Node right;
    private int value;

    Node(int k){  
        this.value = k;
    }
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}

class Tree {
    private Node root;

    private void insertion(Node value, Node currentRoot) {
        if (currentRoot.getValue() < value.getValue()) {
            if (currentRoot.getRight() == null) {
                System.out.println("Setting right :" + currentRoot);
                currentRoot.setRight(value);
            } else {
                System.out.println("At location 1:" + this.root + ":" + currentRoot);
                insertion(value, currentRoot.getRight());
                System.out.println("At location 2:" + this.root + ":" + currentRoot);
            }
        } else {
            if (currentRoot.getLeft() == null) {
                System.out.println("Setting left :" + currentRoot);
                currentRoot.setLeft(value);
            } else {
                System.out.println("At location 3:" + this.root + ":" + currentRoot);
                insertion(value, currentRoot.getLeft());
                System.out.println("At location 4:" + this.root + ":" + currentRoot);
            }
        }
    }


    public void insert(Node value) {
        if (this.root == null) {
            this.root = value;
            System.out.println("Root was null, setting root:" + value);
        } else {
            insertion(value, this.root);
        }
    }

    private void inorderTreeWalk(Node currentRoot) {
        if (currentRoot != null) {
            inorderTreeWalk(currentRoot.getLeft());
            System.out.print(currentRoot.getValue() + " ");
            inorderTreeWalk(currentRoot.getRight());
        }

    }

    public void inorder() {
        if (this.root == null) {
            System.out.println("The tree is empty.");
        } else
            inorderTreeWalk(this.root);
    }

    private void postorderTreeWalk(Node currentRoot) {
        if (currentRoot != null) {
            postorderTreeWalk(currentRoot.getLeft());
            postorderTreeWalk(currentRoot.getRight());
            System.out.print(currentRoot.getValue() + " ");
        }

    }


    public void postOrder() {
        if (this.root == null) {
            System.out.println("The tree is empty.");
        } else
            postorderTreeWalk(this.root);
    }


    private void preorderTreeWalk(Node currentRoot) {
        if (currentRoot != null) {
            System.out.print(currentRoot.getValue() + " ");
            preorderTreeWalk(currentRoot.getLeft());
            preorderTreeWalk(currentRoot.getRight());
        }

    }


    public void preOrder() {
        if (this.root == null) {
            System.out.println("The tree is empty.");
        } else
            preorderTreeWalk(this.root);
    }


    public Node treeSearch(int value) {

        return treeBinarySearch(this.root, value);

    }

    private Node treeBinarySearch(Node currentRoot, int value) {

        if (currentRoot == null || currentRoot.getValue() == value) {
            return currentRoot;
        } else if (value < currentRoot.getValue()) {
            return treeBinarySearch(currentRoot.getLeft(), value);
        } else
            return treeBinarySearch(currentRoot.getRight(), value);

    }

    public Node IterativeTreeSearch(int value1) {
        return IterativeTreeBinarySearch(this.root, value1);
    }

    private Node IterativeTreeBinarySearch(Node currentRoot, int value1) {
        while (currentRoot != null && currentRoot.getValue() != value1) {
            if (value1 < currentRoot.getValue()) {
                currentRoot = currentRoot.getLeft();
            } else if (value1 > currentRoot.getValue()) {
                currentRoot = currentRoot.getRight();
            }
        }
        return currentRoot;
    }

    public Node treeMin(){
        return treeBinaryMin(this.root);
    }

    private Node treeBinaryMin(Node currentRoot){
        while(currentRoot.getLeft() != null){
            currentRoot = currentRoot.getLeft();
        }
        return currentRoot;
    }

    public Node treeMax(){
        return treeBinaryMax(this.root);
    }

    private Node treeBinaryMax(Node currentRoot){
        while(currentRoot.getRight() != null){
            currentRoot = currentRoot.getRight();
        }
        return currentRoot;
    }

}

    public class Main {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Tree t = new Tree();
            int n = s.nextInt();
            while (n-- > 0) {
                int x = s.nextInt();
                t.insert(new Node(x));
            }
//        t.inorder();
//        System.out.println("\n---------------------------------------");
//        t.postOrder();
//        System.out.println("\n---------------------------------------");
//        t.preOrder();
//        System.out.println("\n---------------------------------------");

            int k = s.nextInt();
            System.out.println("Found the node: " + t.treeSearch(k));

            int k1 = s.nextInt();
            System.out.println("Found the node by Iterative method: " + t.IterativeTreeSearch(k1));

            System.out.println("The maximum key is: " + t.treeMax());

            System.out.println("The minimum key is: " + t.treeMin());

        }
    }


/*

10
16 4 10 14 7 9 3 2 8 1

6
6 5 7 2 5 8


*/
