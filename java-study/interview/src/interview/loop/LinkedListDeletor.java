package interview.loop;

import java.util.ArrayList;
import java.util.Arrays;

import interview.common.Node;
import interview.recursion.LinkedListCreator;

public class LinkedListDeletor {
	
	public Node deleteIfEquals(Node head, int value) {
		
		while(head != null && head.getValue() == value) {
			head = head.getNext();
		}
		
		if (head == null) {
			return null;
		}
		
		Node prev = head;
		// 循环不变量，从head到prev都已经删除了等于value的字段
		// 所以下面处理的就是prev后面的节点
		while (prev.getNext() != null) {
			if (prev.getNext().getValue() == value) {
				prev.setNext(prev.getNext().getNext());
			} else {
				// 子节点不等于value的时候，才更新，这个if。。。else 很好！！
				prev = prev.getNext();
			}
		}
		
		return head;
	}

	public static void main(String[] args) {
		LinkedListDeletor deletor = new LinkedListDeletor();
		LinkedListCreator creator = new LinkedListCreator();
		
		Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(1,2,3,2,5)), 2));
		Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2,2,3,2,5)), 2));
		Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2,2,2,2,2)), 2));
		Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(new ArrayList<Integer>()), 2));
	}

}
