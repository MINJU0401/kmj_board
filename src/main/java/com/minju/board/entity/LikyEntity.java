package com.minju.board.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.minju.board.entity.primaryKey.LikyPk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Liky")
@Table(name = "Liky")
@IdClass(LikyPk.class)
public class LikyEntity {
    
    @Id
    private int boardNumber;
    @Id
    private String userEmail;
    private String userNickname;
    private String userProfileImageUrl;

}
