
public class Fruit implements Comparable
{
	
	private double weight;
	private String type;
	public Fruit()
	{
		weight = 0.0;
		type = " ";
	}
	
	//constructor
	public Fruit(String aType, double aWeight)
	{
		setWeight(aWeight);
		setType(aType);
	}
	
	//create getters and setters to access this private variables 

	public double getWeight() {
		return weight;
	}
	public void setWeight(double aWeight) {
		if(this.weight >= 0.0)
			this.weight = aWeight;
	}
	public String getType() {
		return type;
	}
	public void setType(String aName) {
		if(aName != null)
			this.type = aName;
	}
	public String toString()//Basic tostring
	{
		return this.type+" "+this.weight;
	}
	
	public int compareTo(Object aFruit)//Compare to method to be used in LinkedBSTree
	{
		Fruit tmp = (Fruit)aFruit;
		if(this.weight > tmp.getWeight())
			return 1;
		else if(this.weight < tmp.getWeight())
			return -1;
		else
			return 0;
	}

}
