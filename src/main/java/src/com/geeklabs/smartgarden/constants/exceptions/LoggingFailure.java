package src.com.geeklabs.smartgarden.constants.exceptions;

import src.com.geeklabs.smartgarden.annotations.ServiceResponse;
import src.com.geeklabs.smartgarden.constants.responses.ResponseCode;

/**
 * Created by shubha on 7/1/18.
 */
@ServiceResponse(defaultCode = ResponseCode.GENERAL_UNPROCESSABLE_ENTITY)
public class LoggingFailure extends SmartGardenBaseException {
    public LoggingFailure(String message) {
        super(message);
    }
}
