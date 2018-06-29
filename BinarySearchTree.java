/**
 * Binary Search Tree (BST) implementation with some features (methods) like
 * inOrder, preOrder, postOrder, LevelOrder traversals
 * 
 * @author pokhrelayam
 *
 */
public class BinarySearchTree {

	/**
	 * Root of the tree
	 */
	private Node root;

	/**
	 * Node is the class representing tree node. Node may have left or right
	 * childs. TreeNode holds integer data
	 *
	 */
	public class Node {
		Node left;
		Node right;
		int value;

		/**
		 * 
		 * @param data
		 *            Contents/Value of each node
		 */
		public Node(int data) {
			value = data;
			left = null;
			right = null;
		}
	}

	/**
	 * Constructor; Initializing root to null (Not necessary)
	 */
	public BinarySearchTree() {
		root = null;
	}

	/**
	 * Creates a new BST node in the right position and inserts key in that node
	 * 
	 * @param key
	 *            The value to insert in the BST node
	 */
	public void insert(int key) {
		root = insertHelper(root, key);
	}

	/**
	 * Recursive method to add a node at the right location of the BST Tree
	 * 
	 * @param key
	 *            The value to insert at the new BST node
	 */
	private Node insertHelper(Node node, int key) {
		if (node == null) {
			return new Node(key);
		}
		if (key < node.value) {
			node.left = insertHelper(node.left, key);
		} else {
			node.right = insertHelper(node.right, key);
		}
		return node;
	}

	public void delete(int key) {
		root = deleteHelper(root, key);
	}

	private Node deleteHelper(Node node, int key) {
		if (node == null) {
			return null;
		}

		if (key < node.value) {
			node.left = deleteHelper(node.left, key);
		}
		if (key > node.value) {
			node.right = deleteHelper(node.right, key);
		} else {
			// If the node has only one child, replace the node with its child
			if (node.left == null) {
				return node.right;
			}
			if (node.right == null) {
				return node.left;
			}

			// If the node has two childs, copy the value of its least child
			// (i.e. leftmost of it's right child) and delete that child
			node.value = findMin(node.right);
			node.right = deleteHelper(node.right, node.value); // Delete the
																// duplicate
																// child (as we
																// copied the
																// value to the
																// parent)
		}

		return node;
	}

	/**
	 * Find the min value of the subtree at the given node
	 * 
	 * @param node
	 *            The root of subtree for which min value is to be found
	 * @return the min value of the given subtree
	 */
	public int findMin(Node node) {
		int minVal = node.value;
		while (node.left != null) {
			node = node.left;
			minVal = node.value;
		}
		return minVal;
	}

	/**
	 * Prints the in-order traversal
	 */
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	/**
	 * Prints the pre-order traversal
	 */
	public void preOrderTraversal() {
		preOrderTraversal(root);
	}

	/**
	 * Prints the post-order traversal
	 */
	public void postOrderTraversal() {
		postOrderTraversal(root);
	}

	/**
	 * Recursive method for inOrderTraversal
	 */
	private void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.value + " ");
			inOrderTraversal(root.right);
		}

	}

	/**
	 * Recursive method for preOrderTraversal
	 */
	private void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.value + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}

	}

	/**
	 * Recursive method for postOrderTraversal
	 */
	private void postOrderTraversal(Node root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.value + " ");
		}

	}

}