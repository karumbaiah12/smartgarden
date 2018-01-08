package src.com.geeklabs.smartgarden.annotations;

import src.com.geeklabs.smartgarden.constants.responses.ResponseCode;

import java.lang.annotation.*;

/**
 * Created by maheshsapre on 06/07/17.
 */
@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceResponse {
    ResponseCode defaultCode() default ResponseCode.GENERAL_UNIDENTIFIED;
}
