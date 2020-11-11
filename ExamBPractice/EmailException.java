/**
 * 
 */
package ExamBPractice;

/**
 * @author nadiabrandl
 *
 */
@SuppressWarnings("serial")
public class EmailException extends Exception {

    public EmailException() {
	super("Invalid email entry");
    }

    public EmailException(String message) {
	super(message);
    }
}
