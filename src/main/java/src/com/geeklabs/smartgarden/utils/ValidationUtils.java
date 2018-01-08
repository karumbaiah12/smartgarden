package src.com.geeklabs.smartgarden.utils;

import org.apache.commons.validator.routines.EmailValidator;

/**
 * Created by shubha on 7/1/18.
 */
public class ValidationUtils {
    public static boolean isValidEmailAddress(String email) {
         return EmailValidator.getInstance().isValid(email);

    }

    public static boolean isAuth(String authKey) {
        return authKey.equals("testgar123")?true:false;

    }
}
