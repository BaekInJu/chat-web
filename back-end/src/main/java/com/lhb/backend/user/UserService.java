package com.lhb.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //사용자 추가 메서드
    public void createUser(User user) {
        UserEntity userEntity = UserEntity.builder()
                .email(user.getEmail())
                .username(user.getUsername())
                .password(user.getPassword()).build();
        userRepository.save(userEntity);
    }

    //이미 사용중인 이메일을 확인하는 메서드
    public ResponseEntity isUsableEmail(User.UserEmail userEmail) {
        if(userEmail.getEmail().length() > 50){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        if(userRepository.findByEmail(userEmail.getEmail()) == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
