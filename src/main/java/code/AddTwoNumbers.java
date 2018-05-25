package code;

public class AddTwoNumbers {
	
	public static void main(String [] args) {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode l1 = new ListNode(2);
		l1.next  = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
//		ListNode listNode = addTwoNumbers.addTwoNumbersMyself(l1, l2);
		ListNode listNode = addTwoNumbers.addTwoNumbersByLeetCode(l1, l2);
		while (listNode.next != null ) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
		System.out.println(listNode.val);
	}
	
	/**
	 * 该方法思路为先处理l1，l2共同位数的数据，carry表示进位，接着处理l1或者l2的高位，如果最高位产生了进位，则添加进位
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbersMyself(ListNode l1 ,  ListNode l2){
		
		if (l1==null&&l2==null) {
			return null;
		}
		
		ListNode header = new ListNode(0);
		ListNode point = header;
		int carry = 0;
		
		while (l1!=null && l2!=null) {
			int sum = l1.val+l2.val+carry;
			carry = sum/10;
			point.next = new ListNode(sum%10);
			l1 = l1.next;
			l2 = l2.next;
			point = point.next;
		}
		
		while (l1!=null) {
			int sum = l1.val+carry;
			carry = sum/10;
			point.next = new ListNode(sum%10);
			l1 = l1.next;
			point = point.next;
		}
		
		while (l2!=null) {
			int sum = l2.val+carry;
			carry = sum/10;
			point.next = new ListNode(sum%10);
			l2 = l2.next;
			point = point.next;
		}
		
		if (carry!=0) {
			point.next = new ListNode(carry);
		}
		return header.next;
		
	}
	
	/**
	 * 该方法把上方法中的处理高位循环合并到一个循环之中
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbersByLeetCode(ListNode l1 ,  ListNode l2){
		
		ListNode result = new ListNode(0);
		ListNode point = result;
		int carry = 0;
		
		while (l1!=null&&l2!=null) {
			int x = (l1!=null) ? l1.val : 0;
			int y = (l2!=null) ? l2.val : 0;
			int sum = x+y+carry;
			carry = sum/10;
			point.next = new ListNode(sum%10);
			point =point.next;
			if (l1!=null) {
				l1  = l1.next;
			}
			if (l2!=null) {
				l2 = l2.next;
			}
		}
		
		if (carry>0) {
			point.next = new ListNode(carry);
		}
		
		return result.next;
	}
	
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
