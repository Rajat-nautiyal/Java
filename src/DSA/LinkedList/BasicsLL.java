package DSA.LinkedList;

public class BasicsLL {
    static class Node{
        int data;
        Node next;
        Node(int data1, Node next1){
            this.data = data1;
            this.next = next1;
        }
        Node(int data1){
            this.data = data1;
            this.next = null;
        }
    }
    public static void main(String args[]){
        Node x = new Node(5);
        Node y = new Node(6,null);
        x.next = y;
        Node z = new Node(7,null);
        y.next = z;
        Node v = new Node(1,null);
        v.next = x;
        int cnt = 0;
        Node temp = v;
        //traversal and count length
        while(temp != null){
            cnt++;
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("total length"+" "+cnt);
    }
}
