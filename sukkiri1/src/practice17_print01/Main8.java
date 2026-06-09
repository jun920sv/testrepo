package practice17_print01;

public class Main8 {
	public static void main(String[] args) {
	    
		try {
	        FirstException ex;   
	        ex = new SecondException(new Exception());
	        
	        throw ex;
	    } catch (FirstException ex) {}
	}
}
	class FirstException extends RuntimeException {
	    FirstException() {}
	    FirstException(Throwable cause) { super(cause); }
	    FirstException(String message) { super(message); }
	}

	class SecondException extends FirstException {
	    SecondException(Throwable cause) { super(cause); }
	}

