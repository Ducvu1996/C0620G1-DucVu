package collection_framework.bai_tap.postorder_tree;

public class Main {

	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		// Creating a binary tree
		TreeNode<Integer> rootNode =new TreeNode<>(40);

	
		TreeNode<Integer> node20=new TreeNode<>(20);
		TreeNode<Integer> node10=new TreeNode<>(10);
		TreeNode<Integer> node30=new TreeNode<>(30);
		TreeNode<Integer> node60=new TreeNode<>(60);
		TreeNode<Integer> node50=new TreeNode<>(50);
		TreeNode<Integer> node70=new TreeNode<>(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
		System.out.println("Using Recursive solution:");
		System.out.println("Using PostOrder:");
		binaryTree.postOrder(rootNode);
		System.out.println();
		
		System.out.println("Using PreOrder:");
		binaryTree.preOrder(rootNode);
 
		System.out.println();
		System.out.println("Using InOrder:");
		binaryTree.inOrder(rootNode);
		
	}

}
