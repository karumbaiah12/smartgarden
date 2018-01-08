package src.com.geeklabs.smartgarden.constants.pojos;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * Created by shubha on 7/1/18.
 */
public class UserRegisterPojo implements Serializable{
    public UserRegisterPojo(){

    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    @NotEmpty
    private String email;
    private Integer mobileNumber;
    public UserRegisterPojo(String email,Integer mobileNumber){
        this.email=email;
        this.mobileNumber=mobileNumber;

    }

}
