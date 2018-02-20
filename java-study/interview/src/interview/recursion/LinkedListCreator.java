package interview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interview.common.Node;

public class LinkedListCreator {

	/**
	 * create a linked list
	 * 
	 * @param data
	 *            the data to create the list
	 * @return head of the linked list. The returned linked list ends with last node
	 *         with getNext() == null
	 */
	public Node createLinkedList(List<Integer> data) {

		if (data.isEmpty()) {
			return null;
		}

		Node firstNode = new Node(data.get(0));
		Node secondNode = createLinkedList(data.subList(1, data.size()));
		firstNode.setNext(secondNode);
		return firstNode;
	}

	public Node createLargeLinkedList(int size) {
		Node head = null;
		Node prev = null;

		for (int i = 1; i <= size; i++) {
			Node node = new Node(i);
			// 优先判断prev，否则会出现空指针
			if (prev != null) {
				prev.setNext(node);
			} else {
				head = node;
			}
			
			prev = node;
		}
		return head;
	}

	public static void main(String[] args) {
		LinkedListCreator creator = new LinkedListCreator();

		Node.printLinkedList(creator.createLinkedList(new ArrayList<Integer>()));
		Node.printLinkedList(creator.createLinkedList(Arrays.asList(222)));
		Node.printLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5)));
	}
}
