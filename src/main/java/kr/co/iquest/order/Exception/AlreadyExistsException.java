package kr.co.iquest.order.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Already Exists")
public class AlreadyExistsException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6808437564766754894L;

	public AlreadyExistsException(String message) {
		super(message);
	}

}
