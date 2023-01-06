/*
 * Harshil Shah
 */
public class ProcessScheduler {
	private LLQueue <Process> processes; //created a linked list Queue
	private Process curProcess;
	
	public ProcessScheduler() {
		this.processes = new LLQueue<Process>();
		this.curProcess = null;
	}
	
	public Process getCurrentProcess() 
	{
		return curProcess;
	}
	
	public void addProcess(Process aProcess) {
		if(curProcess == null) { //check to see if the current is empty
			curProcess = aProcess;
		}
		else {
			processes.enqueue(aProcess);
		}
	}
	
	public void runNextProcess() {
		curProcess = processes.dequeue();
	}
	
	public void printProcessQueue() {
		processes.print();
	}

	public void cancelCurrentProcess() {
		curProcess = processes.dequeue();
	}
}
