package chapter2;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/6/3 11:06 上午
 */
public class Code1_PrintCommonPart {

    public class Node{
        public int value;
        public Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public static void printCommonPart(Node a, Node b){

        while (a != null && b != null){
            if (a.value < b.value){
                a = a.next;
            }else if (a.value > b.value){
                b = b.next;
            }else {
                System.out.print(a.value + " ");
                a = a.next;
                b = b.next;
            }
        }

    }

}
