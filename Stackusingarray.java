import java.util.Arrays;
import java.util.Scanner;

class Stack{
    private int[] arr;
    private int top = -1;
    private int size = 0;
    private int cap;
    Stack(int cap){
        this.cap = cap;
        this.arr = new int[cap];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public void push(int value){
        if(top == arr.length-1){
            System.out.println("Stack is full");
        }
        else{
            arr[++top] = value;
            size++;
        }
    }

    public int pop(){
        if(size == 0){
            return size;
        }
        else{
            int z = arr[top];
            top--;
            size--;
            return z;
        }
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Stack st = new Stack(n);
        while(n-- > 0){
            int x = s.nextInt();
            st.push(x);
            System.out.println(st);
        }
        //System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
