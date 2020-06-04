package chapter2;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/6/4 11:16 上午
 */
public class Code4_ReverseList {

    public static class Node{
        public int value;
        public Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public class DoubleNode{
        public int value;
        public DoubleNode next;
        public DoubleNode last;
        public DoubleNode(int value) {
            this.value = value;
        }
    }

    public static Node reverseSingalList(Node head) {
        Node res = null;
        Node next;
        while (head != null){
            next = head.next;
            head.next = res;
            res = head;
            head = next;
        }
        return res;
    }

    public static DoubleNode reverseDoubleList(DoubleNode head) {
        DoubleNode res = null;
        DoubleNode next;
        while (head != null){
            next = head.next;
            head.next = res;
            head.last = next;
            res = head;
            head = next;
        }
        return res;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node res = reverseSingalList(head);
        while (res != null){
            System.out.print(res.value + " ");
            res = res.next;
        }
    }
}
