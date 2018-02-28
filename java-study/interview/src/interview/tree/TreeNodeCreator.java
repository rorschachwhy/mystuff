package interview.tree;

public class TreeNodeCreator {

	public TreeNode createSampleTree() {
		TreeNode root = new TreeNode('A');
		root.setLeft(new TreeNode('B'));
		root.getLeft().setLeft(new TreeNode('D'));
		root.getLeft().setRight(new TreeNode('E'));
		root.getLeft().getRight().setLeft(new TreeNode('G'));
		root.setRight(new TreeNode('C'));
		root.getRight().setRight(new TreeNode('F'));
		return root;
	}

	public TreeNode creeTree(String preOrder, String inOrder) {
		
		if (preOrder.isEmpty()) {
			return null;
		}
		
		char rootValue = preOrder.charAt(0);
		
		int inOrderRootIndex = inOrder.indexOf(rootValue);

		TreeNode root = new TreeNode(rootValue);
		// 注意 substring 方法，如果有两个参数，是半开半闭的，例如substring(a, b),其实截取的是[a, b)的数值，b这一位是不会被截取的
		TreeNode left = creeTree(preOrder.substring(1, 1 + inOrderRootIndex),
				inOrder.substring(0, inOrderRootIndex));
		root.setLeft(left);
		
		TreeNode right = creeTree(preOrder.substring(1 + inOrderRootIndex),
				inOrder.substring(1 + inOrderRootIndex)); // 这里的index+1最大就是字符串的长度，结果是空串，不会报错，如果超出长度，就会出错
		root.setRight(right);
		
		return root;
	}
	
	public static void main(String[] args) {
		System.out.println("66".substring(1));//OK
		System.out.println("66".substring(2));//OK
		System.out.println("66".substring(3));//Error
	}
}
