
public class ArrayQueue {
	public int[] queue;
	public int end;
	public int start;

	public ArrayQueue() {
		queue = new int[100];
		end = 0;
		start = 0;

	}

	public boolean empty() {

		return (end == start);

	}

	public void enqueue(int c) {
		if(end <=99) {
			end++;
			queue[end] = c;
		}
		
			
		
			
		

	}

	public int front() {
		if (empty() == true) {
			return -99;
		} else
			return queue[start];
	}

	public void dequeue() {
		if (empty() == true) {
			System.out.println("leer");

		}else
			start++;
		    
		
	}
	public void merge(ArrayQueue queue2) {
		
		while(queue2.empty()==false) {
		enqueue(queue2.front());
		queue2.dequeue();
		
		}
		
	}
	

}
