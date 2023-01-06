
public class SheepHeap
{
	private Sheep[]	heap;
	public static final int DEF_SIZE = 128;
	private int lastIndex; //first ull element
	public SheepHeap() 
	{
		heap = (new Sheep[DEF_SIZE]);
		lastIndex = 0;
	}
	public SheepHeap(int size)
	{
		heap = new Sheep[size]; //TODO
	}
	
	
	public void add (Sheep aData)
	{
		//
		if(lastIndex >= heap.length)
			return;
		heap[lastIndex] = aData;
		bubbleUp();
		lastIndex++;
	}
	private void bubbleUp() {
		int index = lastIndex;
		//greater than 0, and examine parents data
		while(index > 0 && heap[(index-1)/2].compareTo(heap[index])>0)
		{
			Sheep temp = heap[(index-1)/2];
			heap[(index-1)/2] = heap[index];
			heap[index] = temp;
			index = (index-1)/2;
		}
	}

	public Sheep remove()
	{
		if(lastIndex == 0)
			return null;
		Sheep ret = heap[0];
		heap[0] = heap[lastIndex-1]; //last value in breadth order
		heap[lastIndex-1] = null; //losse the reference to the last value
		lastIndex--;
		bubbleDown();	
		return ret;
		
	}
	private void bubbleDown() {
		int index = 0;
		while(index*2+1 < lastIndex)
		{
			int smallIndex = index*2+1;
			if(index*2+2 < lastIndex && heap[index*2+1].compareTo(heap[index*2+2])>0)
				smallIndex = index*2+2;
			if(heap[index].compareTo(heap[smallIndex])>0)
			{
				Sheep temp = heap[index];
				heap[index] = heap[smallIndex];
				heap[smallIndex] = temp;

			}
			else
				break;
			index = smallIndex;
		}
		
	}
	
	public void print()
	{
		for(Sheep h: heap) {
			if(h == null)
				break;
			System.out.println(h);
		}
	}
	
	public void heapSort()
	{
		SheepHeap mHeap = this;
		for(int i = lastIndex; i>0;i--) {
			System.out.println(mHeap.remove()+" ");
		}
		
	}
	
}
