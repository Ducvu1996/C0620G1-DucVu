package collection_framework.bai_tap.search_in_BST;

public class BinarySearchTree<E extends Comparable<E>> {
		
		public boolean search(TreeNode<E> root,E element) {
		   
		     if(root==null ) {
		    	 return false;
		     }

		     else if(root.element.compareTo(element)<0) {
		    	 return search(root.right,element);	
		     }else if(root.element.compareTo(element)>0){
		    	 return search(root.left,element);
		     }else return true;
		}
		 TreeNode root; 
		  
		    // Constructor 
		    BinarySearchTree() 
		    { 
		        root = null; 
		    } 
		void deleteNode(E element) {
			root=delete(root,element);
		}
		TreeNode delete( TreeNode root,E element) {
			if(root==null) {
				return root;
			} 
			if(element.compareTo((E)root.element)<0) {
		       root.left=delete(root.left, element);
		    }else if(element.compareTo((E)root.element)>0) {
		    	root.right=delete(root.right, element);
		    }else {
		    	if(root.left == null) {
	            	
	                 return root.right;
	            }else if(root.right == null) {
	            	
	                 return root.left;
	            }else {
	            	root.element=minValue(root.right);
	            	root.right= delete(root.right,(E)root.element);
	             }
		    	
		    }
			return root;
			
		}

		E minValue(TreeNode root) {
			E min = (E)root.element;
			while(root.left!=null) {
				min = (E)root.left.element;
				root=root.left;
			}
			return min;
		}
		public void postOrder(TreeNode root) {
			if(root!=null) {
				postOrder(root.left);
				postOrder(root.right);
				System.out.printf("%d ",root.element);
			}
		}
}
