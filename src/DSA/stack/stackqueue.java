package DSA.stack;

public class stackqueue {
    private int start;
    private int end;
    private int[] arr;
    private int currSize;
    //constructor
    stackqueue(int size){
        arr = new int[size];
        start = -1;
        end = -1;
        currSize = 0;
    }
    public void push(int x){
        if(currSize == arr.length) System.out.println("stackoverflow");
        else if(start == -1 && end == -1){
            start = 0;
            end = 0;
            arr[end] = x;
            currSize++;
        }
        else{
            end++;
            end = end % arr.length;
            arr[end] = x;
            currSize++;
        }
    }
    public int pop(){
        if(currSize == 0) return -1;
        else{
            int temp = arr[start];
            start++;
            start = start % arr.length;
            currSize--;
            return temp;
        }
    }
    public int peek(){
        if(currSize == 0) return -1;
        return arr[start];
    }
    public boolean isEmpty(){
        if(currSize == 0) return true;
        return false;
    }
    public static void main(String args[]){
        stackqueue s = new stackqueue(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // s.pop();
        System.out.println(s.pop());;
    }
}
