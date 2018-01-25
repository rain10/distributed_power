package org.arain.power.common.exception;
/**
 * 
* <p>Title:ArainException </p>
* @author Arain
* @date2017年8月29日
 */
@SuppressWarnings("serial")
public abstract class ArainException extends RuntimeException{
	public ArainException() {
	}

	public ArainException(String message, Throwable cause) {
		super(message, cause);
	}

	public ArainException(String message) {
		super(message);
	}

	public ArainException(Throwable cause) {
		super(cause);
	}
}
