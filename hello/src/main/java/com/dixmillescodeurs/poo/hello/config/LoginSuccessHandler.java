package com.dixmillescodeurs.poo.hello.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private static final Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication)
        throws ServletException, IOException {

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        logger.info("********************* userName = " + userDetails.getUsername());

        request.getSession().setAttribute("username", userDetails.getUsername());


        super.onAuthenticationSuccess(request, response, authentication);
    }
}
