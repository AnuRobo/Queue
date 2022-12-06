package queue;

class QueueE{
	int arr[];
	int front, cap, size;
	QueueE(int c){
		this.arr = new int[c];
		this.cap = c;
		this.front = 0;
		this.size = 0;
	}
	
	protected boolean isFull() { return cap==size;}
	
	protected boolean isEmpty(){ return size==0;}
	
	protected int getFront() {
		if(isEmpty()) return -1;
		else return front; // returning index
	}
	
	protected int getRear() {
		if(isEmpty()) {
			return -1;
		}else {
			return this.arr[(front+size-1)%cap];
		}
	}
	
	protected void enqueue(int x) {
		if(isFull()) return ;
		
		int rearIndex = getRear();
		
		rearIndex = (rearIndex+1)%cap;
		arr[rearIndex] = x;
		size++;
	}
	
	protected void dequeue() {
		if(isEmpty()) return;
		
		front = (front+1)%cap;
		size--;
	}
}

public class CircularArrayEfficientImpl {

	public static void main(String[] args) {
		
	}

}
