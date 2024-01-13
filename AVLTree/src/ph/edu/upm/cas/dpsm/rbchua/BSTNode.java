package ph.edu.upm.cas.dpsm.rbchua;
/**
 * Node for a binary tree
 * 
 * @author Richard Bryann Chua
 *
 * @param <E> Data type that is to be stored in the binary tree node
 */
public class BSTNode<E extends Comparable<E>> {
	private E key;
	private BSTNode<E> lChild;
	private BSTNode<E> rChild;
	private BSTNode<E> parent;
	
	public BSTNode() {
		key = null;
		lChild = null;
		rChild = null;
		parent = null;
	} // end constructor
	
	public BSTNode(E key) {
		this.key = key;
		lChild = null;
		rChild = null;
		parent = null;
	} // end constructor
	
	public BSTNode(E key, BSTNode<E> parent, BSTNode<E> lChild, BSTNode<E> rChild) {
		this.key = key;
		this.lChild = lChild;
		this.rChild = rChild;
		this.parent = parent;
	} // end constructor
	
	/**
	 * Return the key stored in the node
	 * @return key stored in the node
	 */
	public E getKey() {
		return key;
	} // end getKey
	
	/**
	 * Return the left child of the node
	 * @return left child of the node
	 */
	public BSTNode<E> getLeftChild() {
		return lChild;
	} // end getLeftChild
	
	/**
	 * Return the right child of the node
	 * @return right child of the node
	 */
	public BSTNode<E> getRightChild() {
		return rChild;
	} // end getRightChild
	
	/**
	 * Return the parent of the node
	 * @return parent of the node
	 */
	public BSTNode<E> getParent() {
		return parent;
	} // end getParent
	
	/**
	 * Sets the key stored in the node into a new key
	 * @param key new key that is to be stored in the node
	 */
	public void setKey(E key) {
		this.key = key;
	} // end setKey
	
	/**
	 * Sets the left child of the node into a new left child
	 * @param lChild new left child of the node
	 */
	public void setLeftChild(BSTNode<E> lChild) {
		this.lChild = lChild;
	} // end setLeftChild
	
	/**
	 * Sets the right child of the node into a new right child
	 * @param rChild new right child of the node
	 */
	public void setRightChild(BSTNode<E> rChild) {
		this.rChild = rChild;
	} // end setRightChild
	
	/**
	 * Sets the parent of the node into a new parent
	 * @param parent new parent of the node
	 */
	public void setParent(BSTNode<E> parent) {
		this.parent = parent;
	} // end setParent
	
	@Override
	public String toString() {
		return key.toString();
	}
} // end class
