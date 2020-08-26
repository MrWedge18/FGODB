package mrwedge.fgodb.exception;

public class ServantNotFoundException extends RuntimeException {
	
	public ServantNotFoundException(Integer id) {
		super("Could not find servant " + id);
	}

}
