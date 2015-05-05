package au.com.xandar.meetmanager;

/**
 * Represents a failure of the MeetManager service to start.
 */
public final class MMServiceException extends RuntimeException {

    public MMServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public MMServiceException(Throwable cause) {
        super(cause);
    }
}
