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


class LinkedList{
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public String toString(){
        Node temp = this.head;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            sb.append(temp);
            sb.append(",");
            temp = temp.getNext();
        }
        return sb.toString();
    }


    public void insert(Node value){
        if(this.head == null){
            this.head = value;
        }

        else
            insertion(value, this.head);
    }

    private void insertion(Node value, Node croot){
        if(croot.getNext() == null){
            croot.setNext(value);
        }
        else{
            insertion(value, croot.getNext());
        }
    }

    public void push(Node top){
        if(this.head == null){
            this.head = top;
        }

        else{
            top.setNext(head);
            head = top;
        }
    }

    public Node pop(){
        Node temp = this.head;
        head = head.getNext();
        return temp;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        LinkedList l = new LinkedList();
        while (n-- > 0){
            int x = s.nextInt();
            l.insert(new Node (x));
        }
        System.out.println(l.toString());

        int n1 = s.nextInt();
        LinkedList l1 = new LinkedList();
        while (n1-- > 0){
            int x = s.nextInt();
            l1.push(new Node (x));
        }
        System.out.println(l1.toString());

        for(int i = 0; i < l1.toString().length(); i++) {
            l1.pop();
            System.out.println(l1.toString());
        }
    }
}
