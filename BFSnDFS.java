import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    private Node right;
    private Node left;
    private int value;
    private boolean visited;

    Node(int k){
        this.value = k;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
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

    public void insert(Node value) {
        if (this.root == null) {
            this.root = value;
        } else
            insertion(this.root, value);
    }

    private void insertion(Node croot, Node value) {
        if (croot.getValue() < value.getValue()) {
            if (croot.getRight() == null) {
                croot.setRight(value);
            } else
                insertion(croot.getRight(), value);
        } else {
            if (croot.getLeft() == null) {
                croot.setLeft(value);
            } else
                insertion(croot.getLeft(), value);
        }

    }

    public void BFS() {
        if (this.root == null) {
        } else {
            Queue<Node> print = new LinkedList<>();
            print.add(this.root);
            while (!print.isEmpty()) {
                Node temp = print.poll();
                System.out.println(temp.getValue());
                if (temp.getLeft() != null) {
                    print.add(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    print.add(temp.getRight());
                }
            }
        }
    }

    public void DFS() {
        if (this.root == null) {

        }
        else {
            Stack<Node> print = new Stack<>();
            print.push(this.root);
            while (!print.isEmpty()) {
                Node temp = print.peek();
                if (temp.getLeft() != null && !temp.getLeft().isVisited()) {
                    print.push(temp.getLeft());
                    //temp = temp.getLeft();
                    continue;
                }
                if (temp.getRight() != null && !temp.getRight().isVisited()) {
                    print.push(temp.getRight());
                    //temp = temp.getRight();
                    continue;
                }
                System.out.println(temp.getValue());
                print.pop().setVisited(true);
            }
        }
    }

    public void DFSR(){
        if (this.root == null) {

        }
        else {
            DFSRecur(this.root);
        }
    }

    private void DFSRecur(Node croot){
        if(croot.getLeft() != null){
            DFSRecur(croot.getLeft());
        }
        if(croot.getRight() != null){
            DFSRecur(croot.getRight());
        }

        System.out.println(croot.getValue());

    }
}

public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Tree t = new Tree();
        while(n-- > 0){
            int x = s.nextInt();
            t.insert(new Node(x));
        }
        //t.BFS();
        //t.DFS();
        t.DFSR();
    }
}
