package com.fengcastelo.ms_oauth.Services;

import com.fengcastelo.ms_oauth.Entities.User;
import com.fengcastelo.ms_oauth.feingclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email) {
        User user = userFeignClient.findByEmail(email).getBody();
        if (user == null) {
            logger.error("Email Not Found {}", email);
            throw new IllegalArgumentException("Email Not Found");
        }
        logger.info("Email Found: {}", email);
        return user;
    }
}
