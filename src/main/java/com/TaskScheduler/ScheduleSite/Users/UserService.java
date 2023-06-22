package com.TaskScheduler.ScheduleSite.Users;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public boolean checkPassword(User user, String password) {
        return user.getPassword().equals(password);
    }

    public User register(User user) {
        return userRepository.save(user);
    }
}
