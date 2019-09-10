/**
 * 两数相加(long long long number)
 *
 * @author 春林
 * @create 2019-09-10-22:14
 */


//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
//        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
//        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//        示例：
//
//        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//        输出：7 -> 0 -> 8
//        原因：342 + 465 = 807


public class QuestionTwo {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry=0;
        while(p!=null||q!=null){
            int x=(p!=null)?p.val:0;
            int y=(q!=null)?q.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if (q!=null)q=q.next;
            if (p!=null)p=p.next;
        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void outList(ListNode out){
        ListNode curr=out;
        while(curr!=null){
            System.out.print(curr.val);
            if(curr.next!=null)
                System.out.print("->");
            curr=curr.next;
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        /*示例1*/
//        ListNode test1=new ListNode(2);
//        ListNode curr=test1;
//        curr.next=new ListNode(4);
//        curr=curr.next;
//        curr.next=new ListNode(3);
//        curr=curr.next;
//        outList(test1);

//        ListNode test2=new ListNode(5);
//        curr=test2;
//        curr.next=new ListNode(6);
//        curr=curr.next;
//        curr.next=new ListNode(4);
//        curr=curr.next;
//        outList(test2);

        /*示例2*/
        ListNode test1=new ListNode(2);
        ListNode curr=test1;
        outList(test1);

        ListNode test2=new ListNode(8);
        curr=test2;
        curr.next=new ListNode(9);
        curr=curr.next;
        curr.next=new ListNode(9);
        curr=curr.next;
        outList(test2);

        ListNode result=addTwoNumbers(test1,test2);
        outList(result);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
