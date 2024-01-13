package ph.edu.upm.cas.dpsm.rbchua;
/**
 * Runtime exception thrown when one tries to do something with an empty tree.
 * 
 * @author Richard Bryann Chua
 * 
 *  Adapted from the book 
 * "Data Structures and Algorithms in Java 5th Edition"
 * by Michael Goodrich and Robert Tamassia
 */
public class EmptyTreeException extends RuntimeException {
	public EmptyTreeException(String err) {
		super(err);
	} // end constructor
} // end class
