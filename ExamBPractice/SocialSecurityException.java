/**
 * 
 */
package ExamBPractice;

/**
 * @author nadiabrandl
 *
 */
@SuppressWarnings("serial")
public class SocialSecurityException extends Exception {

    public SocialSecurityException() {
	super("Incorrect entry");
    }

    public SocialSecurityException(String message) {
	super(message);
    }
}
