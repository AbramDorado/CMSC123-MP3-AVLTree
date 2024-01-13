package ph.edu.upm.cas.dpsm.rbchua;


/**
 * Node for an AVL tree
 * 
 * @author Richard Bryann Chua
 *
 * @param <E> Data type that is to be stored in the AVL node
 */
public class AVLNode<E extends Comparable<E>> extends BSTNode<E> {
	private int bf;			// balance factor of the AVL node
	private AVLNode<E> lChild;
	private AVLNode<E> rChild;
	private AVLNode<E> parent;
	public int height;
	
	public AVLNode() {
		super();
		bf = 0;
		height = 0;
	}
	
	public AVLNode(E key) {
		super(key);
		bf = 0;
		height = 0;
	}
	
	public AVLNode(E key, AVLNode<E> parent, AVLNode<E> lChild, AVLNode<E> rChild) {
		super(key, parent, lChild, rChild);
		bf = 0;
	}
	
	
	@Override
	public AVLNode<E> getLeftChild() {
		return lChild;
	} // end getLeftChild
	
	/**
	 * Return the right child of the node
	 * @return right child of the node
	 */
	public AVLNode<E> getRightChild() {
		return rChild;
	} // end getRightChild
	
	/**
	 * Return the parent of the node
	 * @return parent of the node
	 */
	public AVLNode<E> getParent() {
		return parent;
	} // end getParent
	/**
	 * Sets the balance factor of the AVL node
	 * 
	 * @param bf new balance factor of the AVL node
	 */
	
	public void setLeftChild(AVLNode<E> lChild) {
		this.lChild = lChild;
	} // end setLeftChild
	
	/**
	 * Sets the right child of the node into a new right child
	 * @param rChild new right child of the node
	 */
	
	public void setRightChild(AVLNode<E> rChild) {
		this.rChild = rChild;
	} // end setRightChild
	
	/**
	 * Sets the parent of the node into a new parent
	 * @param parent new parent of the node
	 */
	
	public void setParent(AVLNode<E> parent) {
		this.parent = parent;
	} // end setParent
	
	public void setBalanceFactor(int bf) {
		this.bf = bf;
	} // end setBalanceFactor
	
	/**
	 * Returns the balance factor of the AVL node
	 * 
	 * @return balance factor of the AVL node
	 */
	public int getBalanceFactor() {
		return bf;
	} // end getBalanceFactor
	
	@Override
	public String toString() {
		return "(key = " + getKey() + " BF = " + getBalanceFactor() + ")";
	}
} // end class
