package com.minju.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.minju.board.entity.LikyEntity;
import com.minju.board.entity.primaryKey.LikyPk;

@Repository
public interface LikyRepository extends JpaRepository<LikyEntity, LikyPk> {
    List<LikyEntity> findByBoardNumber(int boardNumber);

    @Transactional
    void deleteByBoardNumber(int boardNumber);
}
