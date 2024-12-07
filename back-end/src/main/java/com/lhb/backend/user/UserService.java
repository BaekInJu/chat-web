package com.lhb.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //레파지토리 자동 객체
    @Autowired
    private UserRepository userRepository;

    //사용자 추가 메서드
    public ResponseEntity createUser(User.Info user) {
        UserEntity userEntity = UserEntity.builder()
                .email(user.getEmail())
                .username(user.getUsername())
                .password(user.getPassword()).build();
        userRepository.save(userEntity);
        return new ResponseEntity(HttpStatus.CREATED);
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

    //로그인 (임시로 세션으로)
    public ResponseEntity login(User.UserLogin userLogin){
        UserEntity userEntity = userRepository.findByEmail(userLogin.getEmail());
        if(userEntity == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        if(userEntity.getPassword().equals(userLogin.getPassword())){
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.UNAUTHORIZED);
    }
}
