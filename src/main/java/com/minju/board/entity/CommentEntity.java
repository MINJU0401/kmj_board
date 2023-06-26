package com.minju.board.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Comment")
@Table(name = "Comment")
public class CommentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentNumber;
    private String userEmail;
    private int boardNumber;
    private String commentContent;
    private String writeDatetime;
    private String userNickname;
    private String userProfileImageUrl;
}
