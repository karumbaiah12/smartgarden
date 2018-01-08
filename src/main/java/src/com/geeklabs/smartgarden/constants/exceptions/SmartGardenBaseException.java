package src.com.geeklabs.smartgarden.constants.exceptions;

import src.com.geeklabs.smartgarden.annotations.ServiceResponse;
import src.com.geeklabs.smartgarden.constants.responses.ResponseCode;

/**
 * Created by shubha on 7/1/18.
 */
@ServiceResponse(defaultCode = ResponseCode.GENERAL_UNIDENTIFIED)
public class SmartGardenBaseException extends RuntimeException {
    public static final String LOG_FORMAT = "Error Code: %s; Data: %s; Message: %s";

    private int errorCode;
    private boolean shouldLog = true;


    /**
     * Instantiates a new SmartGarden base exception.
     */
    public SmartGardenBaseException() {
        super("");
    }

    /**
     * Instantiates a new SmartGarden base exception.
     *
     * @param errorCode the error code
     * @param message   the message
     */
    public SmartGardenBaseException(int errorCode, String message) {
        super(message);
        this.errorCode=errorCode;
    }

    /**
     * Instantiates a new SmartGarden base exception.
     *
     * @param message the message
     */
    public SmartGardenBaseException(String message) {
        super(message);
    }

    /**
     * Instantiates a new SmartGarden base exception.
     *
     * @param cause the cause
     */
    public SmartGardenBaseException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new SmartGarden base exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SmartGardenBaseException(String message, Throwable cause) {
        super(message, cause);
    }


    /**
     * Instantiates a new SmartGarden base exception.
     *
     * @param errorCode   the error code
     * @param data        the data
     * @param details     the details
     */
    public SmartGardenBaseException(String errorCode, Object data, String details) {
        super(String.format(LOG_FORMAT, errorCode, data, details));
    }

    /**
     * Instantiates a new SmartGarden base exception.
     *
     * @param errorCode the error code
     * @param data      the data
     * @param details   the details
     * @param throwable the throwable
     */
    public SmartGardenBaseException(String errorCode, Object data, String details, Throwable throwable) {
        super(String.format(LOG_FORMAT, errorCode, data, details), throwable);
    }


    /**
     * Gets error code.
     *
     * @return the error code
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Should log boolean.
     *
     * @return the boolean
     */
    public boolean shouldLog() {
        return shouldLog;
    }

    /**
     * Should log.
     *
     * @param shouldLog the should log
     */
    public void shouldLog(boolean shouldLog) {
        this.shouldLog = shouldLog;
    }
}
