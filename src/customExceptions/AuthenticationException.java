package customExceptions;

public class AuthenticationException extends Exception {
	public AuthenticationException(String msg) {
		super(msg);
	}
}
