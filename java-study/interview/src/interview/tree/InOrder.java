package interview.tree;
/**
 * 寻找中中序遍历的下一节点
 * @author WHY
 *
 */
public class InOrder {

	public TreeNode next(TreeNode node) {
		if (node == null) {
			return null;
		}
		// 1、有右子树，则返回右子树的第一个节点
		if (node.getRight() != null) {
			return first(node.getRight());
		} else {
		// 2、如果没有右子树，则向上查询父节点，如果该节点是其父节点的左子树，则返回父节点，否则继续向上遍历
			// （如果有父亲，且是父亲的右子树，则继续向上遍历）
			while (node.getParent() != null && node.getParent().getRight() == node) {
				node = node.getParent();
			}
			return node.getParent();
		}
	}

	public TreeNode first(TreeNode node) {
		if (node == null) {
			return null;
		}

		TreeNode curNode = node;
		while (curNode.getLeft() != null) {
			curNode = curNode.getLeft();
		}
		return curNode;
	}

	public void traverse(TreeNode root) {
		for (TreeNode node = first(root); node != null; node = next(node)) {
			System.out.print(node.getValue());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		TreeNodeCreator creator = new TreeNodeCreator();
		InOrder inOrder = new InOrder();

		TreeNode sampleTree = creator.createSampleTree();
		inOrder.traverse(sampleTree);
		
		inOrder.traverse(creator.creeTree("", ""));
		inOrder.traverse(creator.creeTree("A", "A"));
		inOrder.traverse(creator.creeTree("AB", "BA"));
		inOrder.traverse(creator.creeTree("ABCD", "DCBA"));
		inOrder.traverse(creator.creeTree("ABCD", "ABCD"));
		
	}

}
