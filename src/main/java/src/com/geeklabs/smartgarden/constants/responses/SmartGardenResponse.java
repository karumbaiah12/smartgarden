package src.com.geeklabs.smartgarden.constants.responses;

import com.fasterxml.jackson.annotation.JsonGetter;
import org.springframework.http.HttpStatus;

/**
 * Created by shubha on 7/1/18.
 */
public class SmartGardenResponse extends AbstractResponse{
    /**
     * The Data.
     */
    Object data;

    /**
     * Instantiates a new SmartGarden response pojo.
     */
    public SmartGardenResponse() {
    }

    public SmartGardenResponse(Integer status, String message) {
        setStatus(status);
        setMessage(message);
    }

    /**
     * Instantiates a new SmartGarden response pojo.
     *
     * @param status  the status
     * @param message the message
     * @param data    the data
     */
    public SmartGardenResponse(Integer status, String message, Object data) {
        setStatus(status);
        setMessage(message);
        this.data = data;
    }

    /**
     * Instantiates a new SmartGarden response pojo.
     *
     * @param status the status
     * @param data   the data
     */
    public SmartGardenResponse(Integer status, Object data) {
        setStatus(status);
        setMessage(null);
        this.data = data;
    }


    /**
     * Instantiates a new SmartGarden response pojo.
     *
     * @param status the status
     */
    public SmartGardenResponse(HttpStatus status) {
        setStatus(status.value());
        setMessage(null);
        this.data = null;
    }


    @JsonGetter("data")
    public Object getData(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

}
