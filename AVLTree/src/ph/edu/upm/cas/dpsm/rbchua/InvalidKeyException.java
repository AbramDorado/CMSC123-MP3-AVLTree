package ph.edu.upm.cas.dpsm.rbchua;
/**
 * Runtime exception for the event that a key is not valid or not found
 * 
 * @author Richard Bryann Chua
 *
 */
public class InvalidKeyException extends RuntimeException {
	public InvalidKeyException(String err) {
		super(err);
	} // end constructor
} // end class