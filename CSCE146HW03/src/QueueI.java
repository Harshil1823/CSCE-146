
public interface QueueI <T>{
	
	public void enqueue(T aData);
	public T dequeue(); //removes first items and returns 
	public T peek(); //returns the data found in first item (head)
	public void print(); //prints out all the items
	
}
