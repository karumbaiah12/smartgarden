package src.com.geeklabs.smartgarden.constants.responses;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import src.com.geeklabs.smartgarden.constants.SmartGardenConstants;

import java.net.HttpURLConnection;

/**
 * Created by shubha on 7/1/18.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractResponse {
    /**
     * The Status.
     */
    Integer status= HttpURLConnection.HTTP_OK;
    /**
     * The Code.
     */
    Integer code;
    /**
     * The Message.
     */
    String message = SmartGardenConstants.MSG_SUCCESS;
    /**
     * The More info.
     */
    String moreInfo;

    Object data = null;

    /**
     * Gets status.
     *
     * @return the status
     */
    @JsonGetter("status")
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    @JsonGetter("code")
    public Integer getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets more info.
     *
     * @return the more info
     */
    @JsonGetter("more_info")
    public String getMoreInfo() {
        return moreInfo;
    }

    /**
     * Sets more info.
     *
     * @param moreInfo the more info
     */
    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    @JsonGetter("data")
    public Object getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(Object data) {
        this.data = data;
    }

}
