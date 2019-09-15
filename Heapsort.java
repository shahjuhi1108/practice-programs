import java.util.Arrays;
import java.util.Scanner;

//Recursion method.

class Heap {
    private int[] container;
    private int size;

    Heap(int[] container) {
        this.container = container;
        this.size = container.length;
    }

    public void build_max_heap() {
        size = container.length;
        for (int i = size / 2; i >= 0; i--) {
            max_heapify(i);
        }
    }


    public void Heapsort(){
        build_max_heap();
        for(int i = size-1; i >= 1; i--){
            int temp = container[0];
            container[0] = container[i];
            container[i] = temp;
            size = size - 1;
            max_heapify(0);
        }
    }
    private void max_heapify(int parent) {
        int l = (2 * parent) + 1;
        int r = (2 * parent) + 2;
        int largest;

        if (l < size && container[parent] < container[l]) {
            largest = l;
        } else
            largest = parent;

        if (r < size && container[r] > container[largest]) {
            largest = r;
        }

        if (parent != largest) {
            int temp = container[largest];
            container[largest] = container[parent];
            container[parent] = temp;
            max_heapify(largest);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            a[i] = x;
        }
        Heap h = new Heap(a);
        //h.build_max_heap();
        h.Heapsort();
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] reverse(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            n = n-1;
            int temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}


/*

10
16 4 10 14 7 9 3 2 8 1


*/
