package goalsapp.security;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.stereotype.Service;

import goalsapp.model.User;
import goalsapp.repository.UserRepository;

@Service
public class FacebookConnectionSignup implements ConnectionSignUp {
 
    @Autowired
    private UserRepository userRepository;
 
    @Override
    public String execute(Connection<?> connection) {
        User user = new User();
        user.setUsername(connection.getDisplayName());
        user.setPassword(RandomStringUtils.randomAlphabetic(8));
        user.setActive(true);
        userRepository.save(user);
        return user.getUsername();
    }
}