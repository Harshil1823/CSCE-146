
public class Sheep implements Comparable <SheepHeap>{

	
	private int arrivalTime;
	private String name;
	private int shearTime;
	
	//constructor
	public Sheep() {
		// initialize the values
		this.arrivalTime = 0;
		this.shearTime = 0;
		this.name = "";
	}
		
	public Sheep(int aT, int sT, String aName)
	{
		this.setArrivalTime(aT);
		this.setShearTime(sT);
		this.setName(aName);
	}
	
	public int compareTo(Sheep aSheep) {
		
		if(this.arrivalTime > aSheep.getArrivalTime()) {
			return 1;
		}
		else if(this.arrivalTime < aSheep.getArrivalTime()) {
			return -1;
		}
		else
			return 0;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShearTime() {
		return shearTime;
	}

	public void setShearTime(int shearTime) {
		this.shearTime = shearTime;
	}


	@Override
	public String toString() {
		return "Name: " + name + ", Shear time: =" + shearTime + ", Arrival time:" + arrivalTime + "]";
	}

	@Override
	public int compareTo(SheepHeap o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
