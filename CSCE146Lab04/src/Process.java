/*
 * Harshil Shah
 */
public class Process {
	
	private String name;
	private double completionTime;
	
	public Process()
	{
		name = "";
		completionTime = 0.0;
	}
	
	public Process(String name, double completionTime) {
		this.name = name;
		this.completionTime = completionTime;
	}
	
	
	public String getName() {//gets the name of the process
		return name;
	}
	
	public void setName(String name) {//sets the name of the process
		 this.name = name;
	}
	
	public double getCompletionTime() {
		return completionTime;
	}
	
	public void setCompletionTime(double completionTime) {
		if(completionTime > 0) {
			 this.completionTime = completionTime;
		}
		else {
			this.completionTime = 0.0; //default value to set it to
		}
	}
	public String toString() {
		return "process name: " +name+" Completion Time" + completionTime;
	}
}
