/*
 * Copyright 2016 (c) Hubble Connected (HKT) Ltd. - All Rights Reserved
 *
 * Proprietary and confidential.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 */

package src.com.geeklabs.smartgarden.constants.exceptions;

import src.com.geeklabs.smartgarden.annotations.ServiceResponse;
import src.com.geeklabs.smartgarden.constants.responses.ResponseCode;

/**
 * The type Bad request exception.
 *
 * @author nikhilvs
 */
/*
* Add extra attributes as per request
*/
@ServiceResponse(defaultCode = ResponseCode.GENERAL_BAD_REQUEST)
public final class BadRequestException extends SmartGardenBaseException {

  /**
   * The Code.
   */
  private int errorCode;

  /**
   * Instantiates a new Bad request exception.
   *
   * @param message the message
   */
  public BadRequestException(String message) {
    super(message);
  }

  /**
   * Instantiates a new Bad request exception.
   *
   * @param message the message
   * @param code    the code
   */
  public BadRequestException(String message, int code) {
    super(message);
    this.errorCode = code;
  }

  /**
   * Instantiates a new Bad request exception.
   *
   * @param message the message
   * @param cause   the cause
   */
  public BadRequestException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Instantiates a new Bad request exception.
   *
   * @param errorCode the error code
   * @param data      the data
   * @param details   the details
   */
  public BadRequestException(String errorCode, Object data, String details) {
    super(String.format(SmartGardenBaseException.LOG_FORMAT, errorCode, data, details));
  }

  /**
   * Gets code.
   *
   * @return the code
   */
  public int getErrorCode() {
    return errorCode;
  }
}

