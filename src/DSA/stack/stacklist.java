package DSA.stack;

public class stacklist {
    class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    private int size;
    stacklist(int size){
        this.size = 0;
    }
    //push
    public void push(int x){
        Node e = new Node(x);
        e.next = head;
        head = e;
        size++;
    }
    public int pop(){
        if(head == null) return -1;
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    //top
    public int top(){
        if(head == null) return -1;
        return head.data;
    }
    public boolean empty(){        
        return size == 0;
    }
    public static void main(String args[]){
        stacklist st = new stacklist(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.empty());
    }
}
