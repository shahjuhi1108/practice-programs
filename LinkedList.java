import java.util.Scanner;


class Node {

    private Node next;
    private int value;

    Node(int k){
        this.value = k;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
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

class DoublyNode extends Node{

    DoublyNode previous;

    DoublyNode(int j){
        super (j);
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

    @Override
    public String toString(){
        DoublyNode temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            sb.append(temp);
            sb.append(",");
            temp = (DoublyNode) temp.getNext();
        }
        return sb.toString();
    }

    public String toReverseString(){
        DoublyNode temp = tail;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            sb.append(temp);
            sb.append(",");
            temp = (DoublyNode) temp.getPrevious();
        }
        return sb.toString();
    }



    public void insert(DoublyNode value){
        if(head == null){
            head = value;
            tail = value;
//            System.out.println("The head value is inserted. - " + head);
//            System.out.println("The tail value is inserted. - " + tail);
        }

        else{
            tail.setNext(value);
            value.setPrevious(tail);
            tail = (DoublyNode) tail.getNext();
//            System.out.println("The head value is inserted. - " + head);
//            System.out.println("The tail value is inserted. - " + tail);
        }
    }

    public void insertAtHead(DoublyNode value){
        if(head == null){
            head = value;
            tail = value;
        }
        else{
            head.setPrevious(value);
            value.setNext(head);
            head = head.getPrevious();
        }
    }

    public void delete(int value){

        if(head == null){
            System.out.println("The doubly linked list is empty.");
        }

        else if(head.getValue() == value){
            ((DoublyNode)head.getNext()).setPrevious(head.getPrevious());
            head = (DoublyNode) head.getNext();
        }

        else if(tail.getValue() == value){
            ((DoublyNode)tail.getPrevious()).setNext(tail.getNext());
            tail = tail.getPrevious();
        }

        else{
            DoublyNode temp = head;

            while(temp != null){
                if(temp.getValue() == value){
                    temp.getPrevious().setNext(temp.getNext());
                    ((DoublyNode)temp.getNext()).setPrevious(temp.getPrevious());
                }
                temp = (DoublyNode) temp.getNext();
            }
        }
    }

    public void removeFirst(){
        ((DoublyNode)head.getNext()).setPrevious(head.getPrevious());
        head = (DoublyNode) head.getNext();
    }

    public void removeLast(){
        tail.getPrevious().setNext(tail.getNext());
        tail = tail.getPrevious();
    }

    public DoublyNode peekAtHead(){
        return head;
    }

    public DoublyNode peekAtTail(){
        return tail;
    }

}





class LinkedList{

    private Node head;

    @Override
    public String toString(){
        return display();
    }

    public String display(){
        Node temp = this.head;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            //System.out.println(temp);
            sb.append(temp);
            sb.append(",");
            temp = temp.getNext();
        }

        return sb.toString();
    }


    public void insertionI(Node value){

        Node temp = this.head;

        if(this.head == null){
            this.head = value;
            return;
        }

        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(value);
    }

    public void insert(Node value){
        if(this.head == null){
            this.head = value;
            System.out.println("Setting the head key: " + value);
        }

        else
            insertion(value, this.head);
    }

    private void insertion(Node value, Node currentHead){

        System.out.println("Currenthead is: " + currentHead);
        System.out.println("Second value is: " + currentHead.getNext());

        if(currentHead.getNext() == null){
            currentHead.setNext(value);
        }

        else
            insertion(value, currentHead.getNext());
    }


    public void delete(int value){
        if(this.head == null){
            System.out.println("The linked list is empty.");
        }

        else if(this.head.getValue() == value){
            head = head.getNext();
        }

        else
            deletion(value, this.head);
    }

    private void deletion(int value, Node currentHead){
        Node temp = currentHead;

        while(temp.getNext() != null){
            if(temp.getNext().getValue() == value){
                temp.setNext(temp.getNext().getNext());
            }

            else{
                temp = temp.getNext();
            }
        }
    }
}

    public class Main {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
//            LinkedList l = new LinkedList();
//            int n = s.nextInt();
//            while (n-- > 0) {
//                int x = s.nextInt();
//                l.insert(new Node(x));
//                System.out.println("--------------------------------------");
//            }
//            System.out.println(l);
//
//            System.out.println("------Using Iteration method.------");
//
//            LinkedList l1 = new LinkedList();
//            int input = s.nextInt();
//            while (input-- > 0) {
//                int x = s.nextInt();
//                l1.insertionI(new Node(x));
//            }
//            System.out.println(l1);
//
//            int y = s.nextInt();
//            l.delete(y);
//            System.out.println("The node has been deleted successfully.");
//            System.out.println(l);

            DoublyLinkedList dl = new DoublyLinkedList();
            int z = s.nextInt();
            while(z-- >0){
                int x = s.nextInt();
                dl.insert(new DoublyNode(x));
            }
            System.out.println(dl);
            System.out.println(dl.toReverseString());

            DoublyLinkedList dl2 = new DoublyLinkedList();
            DoublyLinkedList dl3 = new DoublyLinkedList();
            int z1 = s.nextInt();
            while(z1-- >0){
                int x = s.nextInt();
                dl2.insert(new DoublyNode(x));
                dl3.insertAtHead(new DoublyNode(x));
            }
            System.out.println(dl2);
            System.out.println(dl3);

            int q = s.nextInt();
            dl3.delete(q);
            System.out.println("The node has been deleted successfully.");
            System.out.println(dl3);
            System.out.println("--------------------------------------");
            dl3.removeFirst();
            System.out.println(dl3);
            System.out.println("--------------------------------------");
            dl3.removeLast();
            System.out.println(dl3);
            System.out.println("--------------------------------------");
            System.out.println(dl3.peekAtHead());
            System.out.println("--------------------------------------");
            System.out.println(dl3.peekAtTail());
            System.out.println("--------------------------------------");

        }
    }


/*

10
16 4 10 14 7 9 3 2 8 1

6
6 5 7 2 5 8

7
5 8 2 4 0 3 7

7

*/
