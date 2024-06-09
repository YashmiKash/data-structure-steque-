package steque;
import java.util.LinkedList;

	public class Steque<T> {
	    private LinkedList<T> list;

	    public Steque() {
	        list = new LinkedList<>();
	    }

	    public void enqueue(T item) {
	        list.addLast(item);
	    }

	    public void push(T item) {
	        list.addFirst(item);
	    }

	    public T pop() {
	        return list.pollFirst();
	    }

	    public T peek() {
	        return list.peekFirst();
	    }

	    public boolean isEmpty() {
	        return list.isEmpty();
	    }


	public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Steque<Integer> steque = new Steque<>();
        steque.enqueue(1);
        steque.enqueue(2);
        steque.push(3);
        System.out.println(steque); // Output: [3, 1, 2]
        System.out.println("Size: " + steque.size()); // Output: Size: 3
        System.out.println("Peek: " + steque.peek()); // Output: Peek: 3
        System.out.println("Pop: " + steque.pop()); // Output: Pop: 3
        System.out.println(steque); // Output: [1, 2]
    }
}
