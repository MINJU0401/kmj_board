package com.minju.board.common.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.minju.board.dto.response.ResponseDto;

public class CustomResponse {
    
    public static ResponseEntity<ResponseDto> success() {
        ResponseDto body = new ResponseDto("SU", "SUCCESS");
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    public static ResponseEntity<ResponseDto> databaseError() {
       ResponseDto errorBody = 
        new ResponseDto("DE", "Database Error");
        return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(errorBody);
    } 

    public static ResponseEntity<ResponseDto> validationFailed() {
        ResponseDto errorBody = 
            new ResponseDto("VF", "Request Parameter Validation Failed");
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(errorBody);
    }

    public static ResponseEntity<ResponseDto> notExistBoardNumber() {
        ResponseDto errorBody = 
            new ResponseDto("NB","Non-Existent Board Number");
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(errorBody);
    }

    public static ResponseEntity<ResponseDto> existUserEmail() {
        ResponseDto errorBody = 
            new ResponseDto("EU","Existent User Email");
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(errorBody);
    }

    public static ResponseEntity<ResponseDto> existUserNickname() {
        ResponseDto errorBody = 
            new ResponseDto("EN","Existent User Nickname");
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(errorBody);
    }

    public static ResponseEntity<ResponseDto> existUserPhoneNumber() {
        ResponseDto errorBody = 
            new ResponseDto("ET","Existent User Phone Number");
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(errorBody);
    }
    
    public static ResponseEntity<ResponseDto> signInFailed() {
        ResponseDto errorBody = new ResponseDto("SF","Sign In Failed");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }
    

    public static ResponseEntity<ResponseDto> notExistEmail() {
        ResponseDto errorBody = 
            new ResponseDto("NU","Non-Existent User Email");
        return ResponseEntity
            .status(HttpStatus.UNAUTHORIZED)
            .body(errorBody);
    }

    public static ResponseEntity<ResponseDto> noPermissions() {
        ResponseDto errorBody = 
            new ResponseDto("NP","No Permissions");
        return ResponseEntity
            .status(HttpStatus.FORBIDDEN)
            .body(errorBody);
    }

    public static ResponseEntity<ResponseDto> notExistUserEmail() {
        return null;
    }
}
