public class MergeSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        while(l1.next != null && l2.next != null && listNode.next != null) {
            if (l1.val >= l2.val) {
                listNode.val = l1.val;
                listNode.next = l1.next;
            }else{
                listNode.val = l2.val;
                listNode.next = l2.next;
            }
        }


        return listNode;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3, null); //l1 = [2,4,3]
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(2, l2);
        ListNode l4 = new ListNode(4, null); //l2 = [5,6,4]
        ListNode l5 = new ListNode(6, l4);
        ListNode l6 = new ListNode(5, l5);

        mergeTwoLists(l3, l6); // Output: [2, 3, 4, 4, 5, 6]
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



