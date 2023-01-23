package com.iitgl320222023.gestionboutique.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RessoucreNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6629514807178733792L;

	public RessoucreNotFoundException(String message) {
  		super(message);
  	}
	
}
