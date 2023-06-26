package com.minju.board.service;

import org.springframework.http.ResponseEntity;

import com.minju.board.dto.request.auth.SignInRequestDto;
import com.minju.board.dto.request.auth.SignUpRequestDto;
import com.minju.board.dto.response.ResponseDto;
import com.minju.board.dto.response.auth.SignInResponseDto;

public interface AuthService {
    public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);
    public ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
}
