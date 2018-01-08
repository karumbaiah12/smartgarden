package src.com.geeklabs.smartgarden.security;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by shubha on 8/1/18.
 */
public class SmartGardenAuditAware implements AuditorAware<String> {

    @Override
    public String getCurrentAuditor() {
        String authString = null;
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication == null || !authentication.isAuthenticated()) {
//            return null;
//        }
        return authString;
    }
}
