import java.util.*;
class QueueStacks{
	Stack<Integer> stackEnqueue = new Stack<>();
	Stack<Integer> stackDequeue = new Stack<>();
	
	public void enqueue(int data) {
		stackEnqueue.push(data);
		System.out.println("Data pushed successfully");
	}
	public int dequeue() {
		if(stackEnqueue.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		if(stackDequeue.isEmpty()) {
			if(!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop());
			}
		}
		return stackDequeue.pop();
	}
	public int peek() {
		if(stackEnqueue.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		if(stackDequeue.isEmpty()) {
			if(!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop());
			}
		}
		return stackDequeue.peek();
	}
}
public class QueueUsingStacks {

	public static void main(String[] args) {
		
		QueueStacks queue = new QueueStacks();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println("Deleted element is: "+queue.dequeue());
		System.out.println("Peek element is: "+queue.peek());

	}

}
