package com.minju.board.service.implement;

import org.springframework.http.ResponseEntity;

import com.minju.board.dto.request.user.PostUserRequestDto;
import com.minju.board.dto.response.ResponseDto;

public interface UserService {

    public ResponseEntity<ResponseDto> postUser(PostUserRequestDto dto);

     
}
