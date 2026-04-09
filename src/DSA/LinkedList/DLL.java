package DSA.LinkedList;

import java.util.*;

public class DLL {
    static class Node {
        int data;
        Node next;
        Node back;

        Node(int data1, Node next1, Node back1) {
            this.data = data1;
            this.next = next1;
            this.back = back1;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
            this.back = null;
        }
    }

    public static Node convertArrto2DL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void insertToend(Node head) {
        Node current = head;
        Node newNode = new Node(8);
        while (current.next != null) {
            current = current.next;
        }
        newNode.back = current;
        current.next = newNode;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void deleteEnd(Node head) {
        if (head == null || head.next == null)
            return;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        Node prev = curr.back;
        curr.back = null;
        prev.next = null;
    }

    public static void reverse(Node head) {
        // get tail
        Node tail = head;
        Node thead = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        while (thead != tail) {
            if (thead.back == tail)
                break;
            // swap
            int temp = tail.data;
            tail.data = thead.data;
            thead.data = temp;

            thead = thead.next;
            tail = tail.back;
        }

    }

    public static void removeDuplicates(Node head) {
        // Node temp = head;
        // List<Integer> ls = new ArrayList<>();
        // while (temp != null) {
        //     if (ls.isEmpty() || ls.get(ls.size()-1) != temp.data) ls.add(temp.data);
        //     temp = temp.next;
        // }
        // temp = head;
        // Node prev = null;
        // for (int d : ls) {
        //     temp.data = d;
        //     prev = temp;
        //     temp = temp.next;
        // }
        // if(temp != null) temp.back = null;
        // prev.next = null;
        if (head == null) return;
        Node curr = head;
        while(curr.next != null){            
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
                if(curr.next != null) curr.next.back = curr;
            }else{
                curr = curr.next;
            }
        }
    }

    public static void main(String args[]) {
        // Node head = new Node(1);
        // Node x = new Node(5);
        // Node y = new Node(6,null,x);
        // head.next = x;
        // x.back = head;
        // x.next = y;
        int[] arr = { 1,1,2,3,3,3,3,4,5 };
        Node head = convertArrto2DL(arr);
        // insertToend(head);
        // deleteEnd(head);
        // reverse(head);
        removeDuplicates(head);
        print(head);
    }
}