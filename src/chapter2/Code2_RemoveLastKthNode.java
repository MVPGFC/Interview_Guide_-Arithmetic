package chapter2;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/6/3 11:20 上午
 */
public class Code2_RemoveLastKthNode {

    public class Node{
        public int value;
        public Node next;
        public Node(int value) {
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

    public static Node removeLastKthNodeInSingleLink(Node head, int k){

        if (head == null || k < 1){
            return head;
        }
        Node cur = head;
        while(cur != null){
            k--;
            cur = cur.next;
        }
        if (k < 0 ){
            cur = head;
            while (++k < 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }else if (k == 0){
            head = head.next;
        }
        return head;

    }

    public static DoubleNode removeLastKthNodeInDoubleLink(DoubleNode head, int k){

        if (head == null || k < 1){
            return head;
        }
        DoubleNode cur = head;
        while(cur != null){
            k--;
            cur = cur.next;
        }
        if (k < 0 ){
            cur = head;
            while (++k < 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
            if (cur.next != null){
                cur.next.last = cur;
            }
        }else if (k == 0){
            head = head.next;
            head.last = null;
        }
        return head;

    }
}

