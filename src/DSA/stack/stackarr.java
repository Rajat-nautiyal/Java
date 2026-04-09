package DSA.stack;

public class stackarr{
    private int topindex;
    private int[] arr;

    //constructor
    stackarr(int size){
        arr = new int[size];
        topindex = -1;
    }
    public stackarr(){
        this(10);
    }
    //push
    public void push(int x){
        if(topindex == arr.length-1) System.out.println("Stack Overflow");
        else{
            topindex++;
            arr[topindex] = x;
        }
    }
    //pop
    public int pop(){
        if(topindex < 0) return -1;
        else{
            int temp = arr[topindex];
            arr[topindex] = 0;
            topindex--;
            return temp;
        }        
    }
    //isEmpty
    public boolean isEmpty(){
        if(topindex < 0) return true;
        return false;
    }
    //top fun
    public int top(){
        if(topindex < 0) return -1;
        return arr[topindex];
    }
    public static void main(String[] args){
        stackarr s = new stackarr();
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        System.out.println(s.top());
    }

}
