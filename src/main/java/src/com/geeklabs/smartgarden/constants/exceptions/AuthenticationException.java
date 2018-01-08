package src.com.geeklabs.smartgarden.constants.exceptions;

import src.com.geeklabs.smartgarden.annotations.ServiceResponse;
import src.com.geeklabs.smartgarden.constants.responses.ResponseCode;

/**
 * Created by shubha on 7/1/18.
 */
@ServiceResponse(defaultCode = ResponseCode.GENERAL_AUTHENTICATION_FAILED)
public class AuthenticationException extends SmartGardenBaseException {
    /**
     * The Code.
     */
    int code;

    /**
     * Instantiates a new Authentication exception.
     *
     * @param message the message
     */
    public AuthenticationException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Authentication exception.
     *
     * @param message the message
     * @param code    the code
     */
    public AuthenticationException(String message, int code) {
        super(message);
        this.code = code;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

}
