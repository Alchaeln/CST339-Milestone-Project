package com.exception;

public class DatabaseException extends RuntimeException {
	
	//default constructor calls the default constructor
	//initializepg
	//unchecked exception extrend from runtime exception

	public DatabaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DatabaseException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DatabaseException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DatabaseException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
