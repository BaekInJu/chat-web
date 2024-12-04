package com.lhb.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(UserDTO userDTO) {
        User user = User.builder()
                                .username(userDTO.getUsername())
                                .email(userDTO.getEmail())
                                .password((userDTO.getPassword())).build();

        UserEntity userEntity = UserEntity.builder()
                .email(user.getEmail())
                .username(user.getUsername())
                .password(user.getPassword()).build();
        userRepository.save(userEntity);
    }
}
