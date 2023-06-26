package com.minju.board.dto.request.board2;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.minju.board.dto.request.board.PatchBoardRequestDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchBoardRequestDto2 {
    @NotNull
    private Integer boardNumber;
    @NotBlank
    private String boardTitle;
    @NotBlank
    private String boardContent;
    private String boardImageUrl;

    public PatchBoardRequestDto2(PatchBoardRequestDto dto) {
        this.boardNumber = dto.getBoardNumber();
        this.boardTitle = dto.getBoardTitle();
        this.boardContent = dto.getBoardContent();
        this.boardImageUrl = dto.getBoardImageUrl();
    }
    
}
