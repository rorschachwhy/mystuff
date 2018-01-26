package interview.recursion;

public class Node {
	private final int value;
	private Node next;

	public Node(int value) {
		super();
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

}
