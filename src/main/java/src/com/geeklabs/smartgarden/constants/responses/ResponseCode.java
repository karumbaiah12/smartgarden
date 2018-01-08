package src.com.geeklabs.smartgarden.constants.responses;

import org.springframework.http.HttpStatus;

/**
 * Created by shubha on 7/1/18.
 */
public enum ResponseCode {

    GENERAL_UNIDENTIFIED(HttpStatus.INTERNAL_SERVER_ERROR, 1),
    GENERAL_BAD_REQUEST(HttpStatus.BAD_REQUEST, 2),
    GENERAL_AUTHENTICATION_FAILED(HttpStatus.UNAUTHORIZED, 3),
    GENERAL_UNPROCESSABLE_ENTITY(HttpStatus.UNPROCESSABLE_ENTITY, 2);

    final int id;
    final HttpStatus defaultHttpStatus;

    ResponseCode(HttpStatus defaultHttpStatus, int id){
        this.defaultHttpStatus = defaultHttpStatus;
        this.id = id;

    }

}
