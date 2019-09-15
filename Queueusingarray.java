import java.util.Arrays;
import java.util.Scanner;

//input type given below.
//number of input
//number of operations

class Queue{
    private int[] arr;
    private int size = 0;
    private int tail = 0;
    private int head = 0;
    private int cap;
    Queue(int cap){
        this.cap = cap;
        this.arr = new int[cap];
    }

    @Override
    public String toString() {
        return "Queue{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public void enqueue(int value){
        if(size == cap){
            System.out.println("Stack is full");
        }
        else{
            arr[tail] = value;
            tail = (tail+1) % arr.length;
            size++;
        }
    }

    public int dequeue(){
        if(size == 0){
            System.out.println("Queue is empty.");
            throw new RuntimeException();
        }
        else{
            int z = arr[head];
            arr[head] = 0;
            head = (head+1) % arr.length;
            size--;
            return z;
        }
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Queue q = new Queue(n);
        int op = s.nextInt();
        while(op-- > 0){
            int x = s.nextInt();
            if(x != -1) {
                q.enqueue(x);
            }
            else
                q.dequeue();
            System.out.println(q);
        }
    }
}


-------------------------------------------------------------


5
13
2 9 6 3 5 6 -1 -1 -1 11 10 9 6
