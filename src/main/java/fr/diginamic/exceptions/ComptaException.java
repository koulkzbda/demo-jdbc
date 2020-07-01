package fr.diginamic.exceptions;

public class ComptaException extends RuntimeException {

	/** Constructeur
	 * 
	 */
	public ComptaException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ComptaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 * @param cause
	 */
	public ComptaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 */
	public ComptaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param cause
	 */
	public ComptaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
