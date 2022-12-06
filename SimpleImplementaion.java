package queue;

class QueueSimp{
	int size, cap;
	int arr[];
	
	public QueueSimp(int capacity) {
		this.cap = capacity;
		this.size = 0;
		this.arr = new int[capacity];
	}
	
	protected boolean isFull() {
		return size == cap;	
	}
	
	protected boolean isEmpty() {
		return size == 0;
	}
	
	protected void enqueue(int data) {
		if(isFull()) return ;
		
		arr[size] = data;
		size++;
	}
	
	protected void dequeue() {
		if(isEmpty()) return ;
		
		for(int i = 0; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		
		size--;
	}
	
	protected int getFront() {
		if(isEmpty()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	protected int getRear() {
		if(isEmpty()) {
			return -1;
		}else {
			return size-1;
		}
	}
}

public class SimpleImplementaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
