package day8.array;

public class DemoArray {

    private int[] arr;

    public DemoArray(int[] arr) {
        this.arr = arr;
    }

    public synchronized void printArray(){
        System.out.print(Thread.currentThread().getName() + " : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
