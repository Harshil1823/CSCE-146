//Harshil shah

public class Order implements Comparable <Order> {
	
	
	private String customer;
	private String foodOrder;
	private int cookTime;
	private int arrivalTime;
	private int cookTimeLeft;
	
	//constructor 
	//init the variables 
	public Order()
	{
		this.customer = "none";
		this.foodOrder = "none";
		this.cookTime = 0;
		this.arrivalTime = 0;
		this.cookTimeLeft = 0;
	}
	//paramters to set the value 
	public Order(String aCustomer, String aOrder, int aCookTime, int aArrivalTime)
	{
		this.setCustomer(aCustomer);
		this.setFoodOrder(aOrder);
		this.setCookTime(aCookTime);
		this.setArrivalTime(aArrivalTime);
	}
	
	//getters and setters 
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getFoodOrder() {
		return foodOrder;
	}
	public void setFoodOrder(String foodOrder) {
		this.foodOrder = foodOrder;
	}
	public int getCookTime() {
		return cookTime;
	}
	public void setCookTime(int cookTime) {
		this.cookTime = this.cookTimeLeft = cookTime;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getCookTimeLeft() {
		return cookTimeLeft;
	}
	
	public int compareTo(Order aOrder) {
		return cookTime - aOrder.getCookTime();
	}

	public void cookForOneMinute()
	{
		cookTimeLeft -= 1;
	}
	
	public boolean isDone()
	{
		return this.cookTimeLeft <= 0;
	}
	
	public String toString()//Returns string of customer, order, and cooking time left
	{
		return "Customer"+this.customer+", Order: "+this.foodOrder+", Cooking Time Left: "+this.cookTimeLeft;
	}
	
}
