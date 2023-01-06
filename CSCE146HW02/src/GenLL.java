/*
 * Harshil Shah
 */
public class GenLL <T> {
	private class ListNode{
		/*
		 * these variables only contain the adress since it is part 
		 * of the class object
		 */
		//structure contains data and link
		T data;
		ListNode link;//contains link to next structure  
		
		public ListNode(T aData, ListNode aLink) {
			data = aData;
			link = aLink;		
		}
	}
	
	private ListNode head;//first element
	private ListNode current; //current node of interest
	private ListNode previous; //one node behind current

	
	//constructors
	public GenLL() {
		head = current = previous = null;
	}
	
	public void add(T aData) {
		ListNode newNode = new ListNode(aData,null);
		if (head == null)//empty list
		{
			/*ex: if new node hypothethically has 
			 * byte adress of 128. Current and head now points
			 * to that adress
			 */
			head = current = newNode;
			return;
		}
		//temp variable assigned head's adress of head
		ListNode temp = head;
		while(temp.link != null) 
			temp = temp.link;
		temp.link = newNode;
		
		 
	}  
	public void addAfterCurrent(T aData) {
		if(current == null) {
			return;
		}
		ListNode newNode = new ListNode(aData,current.link);
		current.link = newNode; 
	}
	
	public void print() {
		
		ListNode temp = head;
		while(temp != null) {
			System.out.println(temp.data);//printing data to console
			temp = temp.link; //letting temp move forwards in linkedList
		}
	}
	
	public T getCurrent() {
		if(current == null)
			return null;
		return current.data;
	
	}
	public void setCurrent(T aData) {
		if(aData == null ||  current == null) {
			return;
		}
		current.data = aData;
	}
	public void goToNext() {
		if (current == null)
			return;
		previous = current;
		current = current.link;
	}
	
	public void reset() {
		current = head;
		previous = null;
	}
	
	public boolean hasMore() {
		return current != null;
	}
	
	public void removeCurrent() {
		if(current ==head) {
			head = head.link;
			current = head;
		}
		else {
			previous.link = current.link;
			current = current.link;
		}
	
	}
}
