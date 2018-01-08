package src.com.geeklabs.smartgarden.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import src.com.geeklabs.smartgarden.constants.ErrorCodes;
import src.com.geeklabs.smartgarden.constants.exceptions.AuthenticationException;
import src.com.geeklabs.smartgarden.constants.pojos.UserRegisterPojo;
import src.com.geeklabs.smartgarden.constants.responses.SmartGardenResponse;
import src.com.geeklabs.smartgarden.utils.ValidationUtils;
import src.com.geeklabs.smartgarden.constants.exceptions.BadRequestException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shubha on 7/1/18.
 */
@Service
public class UserService {
    Map<String,String> tempUserMap = new HashMap<String, String>();

    public SmartGardenResponse userRegisterService(UserRegisterPojo pojo, String authenticationToken) {
        if (!ValidationUtils.isAuth(authenticationToken)) {
            return new SmartGardenResponse(ErrorCodes.UNPROCESSABLE_ENTITY, "General auth key is invalid");
        }

        if (!ValidationUtils.isValidEmailAddress(pojo.getEmail())) {
            return new SmartGardenResponse(ErrorCodes.UNPROCESSABLE_ENTITY, "Invalid Email Format");
        }

        if(tempUserMap.containsKey(pojo.getEmail())){
            return new SmartGardenResponse(ErrorCodes.UNPROCESSABLE_ENTITY, "Email already exists");
        }

        tempUserMap.put(pojo.getEmail(),pojo.getEmail());

        return new SmartGardenResponse(ErrorCodes.SUCCESS, "Success!");
    }

    public SmartGardenResponse userLoginService(UserRegisterPojo pojo, String authenticationToken) {
       if(tempUserMap.containsKey(pojo.getEmail())){
           return new SmartGardenResponse(ErrorCodes.SUCCESS, "Success!");
       }

        return new SmartGardenResponse(ErrorCodes.UNPROCESSABLE_ENTITY, "User Not Found");
    }


}
