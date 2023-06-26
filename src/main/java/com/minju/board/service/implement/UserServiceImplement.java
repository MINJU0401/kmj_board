package com.minju.board.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.minju.board.dto.request.user.PostUserRequestDto;
import com.minju.board.dto.response.ResponseDto;
import com.minju.board.entity.UserEntity;
import com.minju.board.repository.UserRepository;

@Service
public class UserServiceImplement implements UserService {

    private UserRepository UserRepository;

    public UserServiceImplement(UserRepository userRepository) {
        this.UserRepository = userRepository;  
    }
    
    @Override
    public ResponseEntity<ResponseDto> postUser(PostUserRequestDto dto) {

        ResponseDto responseBody = null;

        String email = dto.getUserEmail();
        String nickname = dto.getUserNickname();
        String phoneNumber = dto.getUserPhoneNumber();

        try {
            //* 이메일 중복 반환
            boolean hasEmail = UserRepository.existsByEmail(email);
            if (hasEmail) {
                responseBody = new ResponseDto("EU", "Existent User Email");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
            }

            //* 닉네임 중복 반환  
            boolean hasNickname = UserRepository.existsByNickname(nickname);
            if (hasNickname) {
                responseBody = new ResponseDto("EN", "Existent User Nickname");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
            }

            //* 휴대전화번호 중복 반환  
            boolean hasPhoneNumber = UserRepository.existsByPhoneNumber(phoneNumber);
            if (hasPhoneNumber) {
                responseBody = new ResponseDto("EP","Existent User PhoneNumber");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
            }

            //* 유저 레코드 삽입 
            UserEntity userEntity = new UserEntity(dto);
            UserRepository.save(userEntity);

            responseBody = new ResponseDto("SU", "Success");
            

        } catch (Exception exception) {
        //* 데이터베이스 오류 반환
            exception.printStackTrace();
            responseBody = new ResponseDto("DE", "Database Error");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
        }
        
        //* 성공 반환
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);



    }
}
