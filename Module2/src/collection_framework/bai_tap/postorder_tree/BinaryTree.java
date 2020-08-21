package collection_framework.bai_tap.postorder_tree;

public class BinaryTree {
	public void postOrder(TreeNode root) {
		if(root !=  null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.printf("%d ",root.element);
		}
	}
	public void preOrder(TreeNode root) {
		if(root !=  null) {
			System.out.printf("%d ",root.element);
			preOrder(root.left);
			preOrder(root.right);
			
		}
	}
	public void inOrder(TreeNode root) {
		if(root !=  null) {
			
			inOrder(root.left);
			System.out.printf("%d ",root.element);
			inOrder(root.right);
			
		}
	}
   
}
