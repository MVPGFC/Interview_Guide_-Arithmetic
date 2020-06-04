package chapter2;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/6/3 11:53 上午
 */
public class Code3_RemoveXStationNode {

    public class Node{
        public int value;
        public Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public static Node removeMidNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        Node pre = head;
        Node cur = head.next.next;

        while (cur.next != null && cur.next.next != null) {
            cur = cur.next.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    public static Node removeNodeByRatio(Node head, int a, int b){
        if (a > b || a < 1) {
            return head;
        }
        int n = 0;
        Node cur = head;
        while (cur != null){
            n++;
            cur = cur.next;
        }
        n = (int) Math.ceil( (double)(a * n) / (double)b );
        if (n == 1){
            head = head.next;
        }else {
            cur = head;
            while (--n != 1){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }
}
