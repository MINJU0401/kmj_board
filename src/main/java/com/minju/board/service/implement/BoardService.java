package com.minju.board.service.implement;

import org.springframework.http.ResponseEntity;

import com.minju.board.dto.request.board.PatchBoardRequestDto;
import com.minju.board.dto.request.board.PostBoardRequestDto;
import com.minju.board.dto.request.board2.PatchBoardRequestDto2;
import com.minju.board.dto.request.board2.PostBoardRequestDto2;
import com.minju.board.dto.response.board.GetBoardResponseDto;
import com.minju.board.dto.response.board.GetBoardListResponseDto;
import com.minju.board.dto.response.ResponseDto;

public interface BoardService {
    public ResponseEntity<ResponseDto> postBoard(PostBoardRequestDto dto);
    public ResponseEntity<ResponseDto> postBoard(String userEmail, PostBoardRequestDto2 dto);
    public ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);
    public ResponseEntity<? super GetBoardListResponseDto> getBoardList();
    public ResponseEntity<? super GetBoardListResponseDto> getBoardTop3();
    public ResponseEntity<ResponseDto> patchBoard(PatchBoardRequestDto dto);
    public ResponseEntity<ResponseDto> patchBoard(String userEmail, PatchBoardRequestDto2 dto);
    public ResponseEntity<ResponseDto> deleteBoard(String userEmail, Integer boardNumber);
}
