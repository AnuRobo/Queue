package queue;

class Node{
	int data;
	// self referential structure
	Node next;
	
	Node(int x){
		this.data = x;
		this.next = null;
	}
	
}

class QueueL{
	Node front, rear;
	int size;
	
	QueueL(){
		front = rear = null;
		size = 0;
	}
	
	protected void enqueue(int x) {
		Node temp = new Node(x);
		if(front == null) {
			front = rear = temp;
			return;
		}
		
		rear.next = temp;
		rear = temp;
	}
	
	protected void dequeue() {
		if(front == null) return;
		
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
	}
}

public class QueueLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
