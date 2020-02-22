import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;
    
    public BinaryTree() {
    	root = null;
    }
	
    public BinaryTree(int key) {
    	root = new Node(key);
    }
    
    
	public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        /* Print inorder traversal of the input tree */
        System.out.print( "\n Inorder traversal of the"
                +" coned tree is \n"); 
        inOrder(tree.root); 
      
        /* Convert tree to its mirror */
        mirror(tree.root); 
      
        /* Print inorder traversal of the mirror tree */
        System.out.print( "\n Inorder traversal of the "+ 
            "mirror tree is \n"); 
        inOrder(tree.root); 

	}
	
	/* Helper function to print Inorder traversal.*/
	static void inOrder( Node node) 
	{ 
	    if (node == null) 
	        return; 
	    inOrder(node.left); 
	    System.out.print( node.key + " "); 
	    inOrder(node.right); 
	} 
	
	static void mirror(Node root) 
	{ 
		// incomplete
		Queue<Node> q = new LinkedList<>(); 
		q.add(root); 
 
		while (q.size() > 0) 
		{ 
			// pop top node from queue 
			Node curr = q.peek(); 
			q.remove(); 
  
			// swap left child with right child 
			Node temp = curr.left; 
			curr.left = curr.right; 
			curr.right = temp;; 
  
			// push left and right children 
			if (curr.left != null) 
				q.add(curr.left); 
			if (curr.right != null) 
				q.add(curr.right); 
		} 
	} 

}
