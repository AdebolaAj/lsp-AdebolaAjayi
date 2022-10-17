package org.howard.edu.lsp.assignment5;

//Create user defined exception IntegerSetException

public class IntegerSetException extends Exception {
	 private static final long serialVersionUID = 7771502616486391536L;

	public IntegerSetException(String str)  
	 {  
	     // Call the constructor of parent exception
	     super(str); 
	 }  
	}