import java.util.LinkedList;


class LL_as4 {
	//Implement your logic here
private LinkedList<String> queue;
    private int maxSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new LinkedList<>();
    }

    public LinkedList<String> getQueue() {
        return queue;
    }

    public boolean isFull() {
        return queue.size() >= maxSize;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean enqueue(String data) {
        if (!isFull()) {
            queue.addLast(data);
            return true;
        }
        return false;
    }

    public boolean dequeue() {
        if (!isEmpty()) {
            queue.removeFirst();
            return true;
        }
        return false;
 // Queue is empty
    }

}

class Tester {

	public static void main(String arga[]){
		Queue queue= new Queue(5);
		
		queue.enqueue("Emily");
		queue.enqueue("Lily");
		queue.enqueue("Rachel");
		queue.enqueue("Rose");
		
		queue.dequeue();
		queue.dequeue();
	
		System.out.println(queue.getQueue());
	}
}