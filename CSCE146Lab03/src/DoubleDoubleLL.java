/*
 * Harshil Shah
 */
public class DoubleDoubleLL {


	private class ListNode
	{
		
		
		Double data;
		ListNode nextLink; //same as .link //pointer to next node
		ListNode previousLink; //pointer to previous node, same as .link to previous
		
	
		//constructor
		public ListNode(double data,ListNode pLink, ListNode nLink) {
			this.data = data;
			previousLink = pLink;
			nextLink = nLink;
		}
		
	}//class listNode
	
	private ListNode head, current, previous;

	public  DoubleDoubleLL() {
		head = previous = current = null;
	}
	
	
	public void gotoNext() {
		if(current != null) {
			previous = current;
			current = current.nextLink;
		}
		/*
		 * assigned current to previous and then went to the next node 
		 * with current.nextLink and assigned that back to the current. 
		 * So, now I am back at current but with nextnode. 
		 */
	}
	public void reset() {
		current = head;
		previous = null;
	}
	
	public void gotoEnd() {
		
		reset();
		while(current.nextLink != null) {
			gotoNext();
		}
	}
	
	public boolean hasMore() {
		return current != null;//returns current until it has more
	}


	public double getCurrent() {
		if(current == null) {
			return 0;
		}
		return current.data;
	}
	
	public void add(double aData) {
		ListNode newNode = new ListNode(aData, previous, null);
		
		if(head == null) {
			head = current = newNode;
			return;
		}
		
		ListNode temp = head;
		while(temp.nextLink != null) {
			temp = temp.nextLink;
		}
		newNode.previousLink = temp;
		temp.nextLink = newNode;
		current = newNode;
		previous = temp;
	}
	
	public void removeCurrent() {
		
		if(current.nextLink == null) {
			current = previous;
			current.nextLink = null;
			return;
		}
		if(head == current) {
			current = head.nextLink;
			current.previousLink = null;
			head = current;
			return;
		}
		
		current = current.nextLink;
		current.previousLink = previous;
		previous.nextLink = current;
		return;
	}
	
	public void setCurrent(double aData) {
		if(current != null) {
			current.data = aData;
		}
	}
	
	public void print() {
		reset();
		while(current != null) {
			System.out.println(current.data);
			gotoNext();
			
		}
	}


	public boolean contains(Double aData) {
		
		boolean contains = false;
		reset();
		while(current != null) {
			if(current.data.equals(aData)) {
				contains = true;
			}
			gotoNext();
		}
		return contains;
	}
	

	
}//class
