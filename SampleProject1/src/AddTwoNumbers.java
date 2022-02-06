
public class AddTwoNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null, curr = null;
        int carry = 0, val1 = 0, val2 = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            else val1 = 0;

            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            else val2 = 0;

            int val = val1 + val2 + carry;
            carry = val >= 10 ? 1 : 0;
            val = val % 10;

            ListNode node = new ListNode(val);

            if (head == null) {
                head = node;
                curr = node;
            } else {
                curr.next = node;
                curr = node;
            }
        }
        if (carry == 1) {
            ListNode node = new ListNode(1);
            curr.next = node;
            curr = node;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3,null); //l1 = [2,4,3]
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(2, l2);
        ListNode l4 = new ListNode(4, null); //l2 = [5,6,4]
        ListNode l5 = new ListNode(6, l4);
        ListNode l6 = new ListNode(5, l5);

        addTwoNumbers(l3,l6);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}