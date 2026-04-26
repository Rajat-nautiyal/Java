package DSA.stack;

public class queuelist {
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
    Node tail = head;
    int size = 0;

    public void push(int x){
        Node el = new Node(x);
        if(head == null){
            head = el;
            tail = el;
        }else{
            tail.next = el;
            tail = el;
        }
        tail.next = null;
        size++;
    }

    public int pop(){
        if(size == 0) return -1;
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int top(){
        if(size == 0) return -1;
        return head.data;
    }
    public boolean empty(){
        return size == 0;
    }
        public static void main(String args[]){
        queuelist st = new queuelist();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(5);
        System.out.println(st.top());

        System.out.println(st.empty());
    }

}
