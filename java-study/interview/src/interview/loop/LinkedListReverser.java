package interview.loop;

import java.util.ArrayList;
import java.util.Arrays;

import interview.common.Node;
import interview.recursion.LinkedListCreator;

public class LinkedListReverser {
	
	public Node reverseLinkedList(Node head) {
		Node newHead = null;
		Node currentHead = head;
		
		while(currentHead != null) {
			// loop invariant
			Node next = currentHead.getNext();
			currentHead.setNext(newHead);
			newHead = currentHead;
			currentHead = next;
		}
		
		return newHead;
	}
	
	public static void main(String[] args) {
		LinkedListCreator creator = new LinkedListCreator();
		LinkedListReverser reverser = new LinkedListReverser();

		Node.printLinkedList(reverser.reverseLinkedList(creator.createLinkedList(new ArrayList<Integer>())));
		Node.printLinkedList(reverser.reverseLinkedList(creator.createLinkedList(Arrays.asList(222))));
		Node.printLinkedList(reverser.reverseLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));
		Node.printLinkedList(reverser.reverseLinkedList(creator.createLargeLinkedList(100000)));
	}

}
