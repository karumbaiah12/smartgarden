package src.com.geeklabs.smartgarden.endpoints;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import src.com.geeklabs.smartgarden.constants.*;
import src.com.geeklabs.smartgarden.constants.Versions;
import src.com.geeklabs.smartgarden.constants.exceptions.AuthenticationException;
import src.com.geeklabs.smartgarden.constants.exceptions.BadRequestException;
import src.com.geeklabs.smartgarden.constants.pojos.UserRegisterPojo;
import src.com.geeklabs.smartgarden.constants.responses.SmartGardenResponse;
import src.com.geeklabs.smartgarden.service.UserService;

import javax.validation.Valid;

/**
 * Created by shubha on 7/1/18.
 */
@RestController
@RequestMapping("v1"+"users")
public class UserEndpoint {
    @Autowired
    private final UserService userService;

    @Autowired
    public UserEndpoint(UserService userService) {
      this.userService = userService;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public SmartGardenResponse userRegister(
            @RequestBody @Valid UserRegisterPojo pojo,
            @RequestParam(value = "api_key", required = true) String authenticationToken)
            throws BadRequestException,
            AuthenticationException {
        return userService.userRegisterService(pojo, authenticationToken);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public SmartGardenResponse userLogin(
            @RequestBody @Valid UserRegisterPojo pojo,
            @RequestParam(value = "api_key", required = true) String authenticationToken)
            throws BadRequestException,
            AuthenticationException {
        return userService.userLoginService(pojo, authenticationToken);
    }

//    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//    public SmartGardenResponse userRegister(
//            @RequestParam(value = "api_key", required = true) String authenticationToken)
//    {
//        return userService.userRegisterService();
//    }
}
