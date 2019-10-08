package Chap01Fundamentals.Chap01_03;

public class FixedCapacityStackOfString {
    private String[] a;  // stack entries
    private int N;  // size
    public FixedCapacityStackOfString(int capacity){
        this.a = new String[capacity];
    }

    public boolean isEmpty() {return this.N == 0;}
    public int size(){return this.N;}
    public void push(String item){
        this.a[this.N ++] = item;
    }
    public String pop(){
        return this.a[--this.N];
    }
}
