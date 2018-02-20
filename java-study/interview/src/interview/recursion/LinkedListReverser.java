package interview.recursion;

import java.util.ArrayList;
import java.util.Arrays;

import interview.common.Node;

public class LinkedListReverser{

	/**
	 * Reverse a linked list
	 * 
	 * @param head
	 *            the linked list to reverse
	 * @return head of the reversed linked list
	 */
	public Node reverseLinkedList(Node head) {
		// size == 0 || size == 1
		if (head == null || head.getNext() == null) {
			return head;
		}

		Node newHead = reverseLinkedList(head.getNext());

		// 这里很妙，因为新的newHead的头节点是之前的最后一个节点，所以要找到newHead的最后一个节点，跟head的头节点关联，
		// 可以使用输入的head的 next节点
		head.getNext().setNext(head);
		head.setNext(null);

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
