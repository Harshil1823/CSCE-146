//Harshil Shah
public class OrderScheduler {
	public MinHeap <Order> orders;
	
	private Order currentOrder;
	private int currentMinute;
	private int totalOrders;
	private int sumWaitingTimes;
	
	
	public OrderScheduler()
	{
		orders = new MinHeap<Order>();
	}
	
	public void addOrder(Order anOrder)//Adds order
	{
		if(currentOrder == null)
			currentOrder = anOrder;
		else orders.add(anOrder);
		totalOrders++;
	}
	
	public void advanceOneMinute()//advances the orders by oneMIN
	{
		if(currentOrder == null)
			return;
		currentMinute++;
		currentOrder.cookForOneMinute();
		if(currentOrder.isDone())
		{
			sumWaitingTimes += currentMinute - currentOrder.getArrivalTime();
			currentOrder = orders.remove();
		}
	}
	
	public boolean isDone()
	{
		return currentOrder == null;
	}
	public double getAverageWaitingTime()
	{
		return (double)sumWaitingTimes/(double)totalOrders;
	}
	public Order getCurrentOrder()
	{
		return currentOrder;
	}
	
}
