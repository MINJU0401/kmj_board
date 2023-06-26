package com.minju.board.dto.request.board;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchBoardRequestDto {
    @NotBlank
    @Email
    private String userEmail;
    @NotNull
    private Integer boardNumber;
    @NotBlank
    private String boardTitle;
    @NotBlank
    private String boardContent;
    private String boardImageUrl;
}
