/*
 * Harshil Shah
 */
public class LLQueue <T>{
	private class ListNode
	{
		T data;
		ListNode link;
		
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	private ListNode head;
	private ListNode tail;
	
	public LLQueue() {
		head = tail = null;
	}
	
	public void enqueue(T aData) {
		ListNode newNode = new ListNode(aData, null); //end of the link so link should be null
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.link = newNode;
		tail = tail.link;
	}
	
	public T dequeue() {
		if (head == null) {
			return null;
		}
		T ret = head.data;
		head = head.link;
		return ret;
	}
	
	public T peek() {
		if(head == null) {
			return null;
		}
		return head.data;
	}
	
	public void print()
	{
		for(ListNode temp = head; temp != null; temp = temp.link) {
			System.out.println(temp.data);
		}
	}
}
