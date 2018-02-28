package interview.tree;

public class TreeTraversal {

	// 前序遍历：中前后
	public void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getValue());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	// 中序遍历：前中后
	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.getValue());
		inOrder(root.getRight());
	}

	// 后序遍历：前后中
	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getValue());
	}
	
	public String postOrder(String preOrder, String inOrder) {
		
		if (preOrder.isEmpty()) {
			return "";
		}
		
		char rootValue = preOrder.charAt(0);
		
		int inOrderRootIndex = inOrder.indexOf(rootValue);

		// 注意 substring 方法，如果有两个参数，是半开半闭的，例如substring(a, b),其实截取的是[a, b)的数值，b这一位是不会被截取的
		String left = postOrder(preOrder.substring(1, 1 + inOrderRootIndex),
				inOrder.substring(0, inOrderRootIndex));
		
		String right = postOrder(preOrder.substring(1 + inOrderRootIndex),
				inOrder.substring(1 + inOrderRootIndex)); // 这里的index+1最大就是字符串的长度，结果是空串，不会报错，如果超出长度，就会出错
		
		String root = left + right + rootValue;
		
		return root;
	}
	
	public TreeNode getFirst(TreeNode node) {
		if(node == null) {
			return node;
		}
		while(node.getLeft() !=null) {
			node = node.getLeft();
		}
		return node;
	}

	public static void main(String[] args) {
		TreeTraversal traversal = new TreeTraversal();
		TreeNodeCreator creator = new TreeNodeCreator();
		
		System.out.println("=====================");
		System.out.println("Sample tree traversal");
		System.out.println("=====================");
		
		TreeNode sampleTree = creator.createSampleTree();

		traversal.preOrder(sampleTree);
		System.out.println();

		traversal.inOrder(sampleTree);
		System.out.println();

		traversal.postOrder(sampleTree);
		System.out.println();
		
		System.out.println("=====================");
		System.out.println("Generating tree from preOrder and inOrder");
		System.out.println("=====================");
		
		traversal.postOrder(creator.creeTree("ABDEGCF", "DBGEACF"));
		System.out.println();
		
		traversal.postOrder(creator.creeTree("", ""));
		System.out.println();
		
		traversal.postOrder(creator.creeTree("A", "A"));
		System.out.println();
		
		traversal.postOrder(creator.creeTree("AB", "BA"));
		System.out.println();
		
		// 直接输出字符串
		System.out.println("====================");
		System.out.println("Generating postOrder directly");
		System.out.println("====================");
		
		System.out.println(traversal.postOrder("ABDEGCF", "DBGEACF"));
		System.out.println(traversal.postOrder("", ""));
		System.out.println(traversal.postOrder("A", "A"));
		System.out.println(traversal.postOrder("AB", "BA"));
		
		
		System.out.println("====================");
		
		TreeNode test = creator.creeTree("ABDEGCF", "DBGEACF");
		TreeNode first = traversal.getFirst(test);
		System.out.println(test.getValue());
		System.out.println(first.getValue());
	}

}
