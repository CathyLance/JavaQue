/**
 * 删除单链表倒数第N个结点
 *
 * @author 春林
 * Create 2019-09-11-11:13
 */



//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
//
//        示例：
//
//        给定一个链表: 1->2->3->4->5, 和 n = 2.
//
//        当删除了倒数第二个节点后，链表变为 1->2->3->5.
//        说明：
//
//        给定的 n 保证是有效的。
//
//        进阶：
//
//        你能尝试使用一趟扫描实现吗？

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DelListNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

//          错误，删除头结点的时候会报NOLLPOINTERROR
//        ListNode oneCurr=head;
//        ListNode twoCurr=head;

        ListNode oneCurr=dummy;
        ListNode twoCurr=dummy;

        for (int i=0;i<n;i++){
            oneCurr=oneCurr.next;
        }

        while(oneCurr.next!=null){
            oneCurr=oneCurr.next;
            twoCurr=twoCurr.next;
        }
        twoCurr.next=twoCurr.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode test1=new ListNode(2);
        ListNode curr=test1;
        curr.next=new ListNode(4);
        curr=curr.next;
        curr.next=new ListNode(3);
        curr=curr.next;
        curr.next=new ListNode(6);
        curr=curr.next;
        curr.next=new ListNode(4);
        QuestionTwo.outList(test1);

        DelListNode tp=new DelListNode();
        test1=tp.removeNthFromEnd(test1,5);

        QuestionTwo.outList(test1);

    }
}

