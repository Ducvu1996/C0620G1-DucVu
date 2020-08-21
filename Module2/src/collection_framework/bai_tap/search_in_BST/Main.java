package collection_framework.bai_tap.search_in_BST;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> binaryTree=new BinarySearchTree<>();
		// Creating a binary tree
		TreeNode<Integer> root =new TreeNode<>(40);

	
		TreeNode<Integer> node20=new TreeNode<>(20);
		TreeNode<Integer> node10=new TreeNode<>(10);
		TreeNode<Integer> node30=new TreeNode<>(30);
		TreeNode<Integer> node60=new TreeNode<>(60);
		TreeNode<Integer> node50=new TreeNode<>(50);
		TreeNode<Integer> node70=new TreeNode<>(70);
		root.left=node20;
		root.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
		//System.out.println(binaryTree.search(root,80));
		binaryTree.delete(root,70);
		binaryTree.postOrder(root);
	}

}
