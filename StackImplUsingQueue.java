package queue;

import java.util.*;
import java.util.LinkedList;

class StackQ{
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	void push(int x) {
		// Push x first in empty q2
		q2.add(x);
		
		// Push all the remaining elements in q1 to q2
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		// swap the names of two queues
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}
	
	void pop() {
		if(q1.isEmpty()) {
			return;
		}
		q1.remove();
	}
	
	int top() {
		if(q1.isEmpty()) {
			return -1;
		}
		return q1.peek();
	}
	
	int size() {
		return q1.size();
	}
	
	void queu() {
		System.out.println(q1);
	}
}

public class StackImplUsingQueue {

	public static void main(String[] args) {
		StackQ s = new StackQ();
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.queu();
		
		System.out.println("Size: " + s.size());
		
		System.out.println(s.top());
		s.pop();
		
		System.out.println(s.top());
		s.pop();
		
		System.out.println(s.top());
		
		System.out.println("Size: "+s.size());
	}

}
