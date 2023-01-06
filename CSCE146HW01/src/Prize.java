/*
 * Harshil shah
 */
public class Prize {

	private String name;
	private double prize; 
	
	public Prize() {
		
	}
	//pass the variable value to the constructor 
	public Prize(String name, double prize) {
		this.name = name;
		this.prize = prize;
	}
	
	//create getters and setters to have access
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = name;
	}
	
	public double getPrize() {
		return prize;
	}
	
	public void getPrize(double newPrize) {
		this.prize = newPrize;
	}
}
