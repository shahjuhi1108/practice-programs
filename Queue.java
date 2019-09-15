import java.util.Scanner;

class Node{

    private Node next;
    private int value;

    Node(int k){
        this.value = k;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString(){
        return "Node{" + "value=" + value + '}';
    }

}

class DoublyNode extends Node{
    DoublyNode previous;

    DoublyNode(int j){
        super(j);
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }
}


class DoublyLinkedList{
    private DoublyNode head;
    private DoublyNode tail;

    public DoublyNode getHead() {
        return head;
    }

    public void setHead(DoublyNode head) {
        this.head = head;
    }

    public DoublyNode getTail() {
        return tail;
    }

    public void setTail(DoublyNode tail) {
        this.tail = tail;
    }

    @Override
    public String toString(){
        DoublyNode temp = this.head;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            sb.append(temp);
            sb.append(",");
            temp = (DoublyNode) temp.getNext();
        }
        return sb.toString();
    }

    public void enqueue(DoublyNode value){
        if(this.head == null){
            this.head = value;
            this.tail = value;
        }

        else{
            value.setPrevious(tail);
            tail.setNext(value);
            tail = value;
        }
    }

    public DoublyNode dequeue(){
        DoublyNode temp;

        if(this.head == null){
            System.out.println("Queue is empty.");
            return null;
        }

        else{
            temp = this.head;
            if(this.head.getNext() != null){
                ((DoublyNode)head.getNext()).setPrevious(null);
            }
            head = (DoublyNode) head.getNext();
            temp.setNext(null);
            return temp;
        }
    }
}

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        DoublyLinkedList dl = new DoublyLinkedList();
        while (n-- > 0){
            int x = s.nextInt();
            dl.enqueue(new DoublyNode (x));
        }
        System.out.println(dl.toString());

        int n1 = s.nextInt();
        DoublyLinkedList dl1 = new DoublyLinkedList();
        while (n1-- > 0){
            int x = s.nextInt();
            dl1.enqueue(new DoublyNode (x));
        }
        System.out.println(dl1.toString());

        dl1.dequeue();
        System.out.println(dl1.toString());

        for(int i = 0; i < dl1.toString().length(); i++){
            dl1.dequeue();
            System.out.println(dl1.toString());

        }
    }
}
