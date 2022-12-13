package com.mypjt.board.model.dao;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public class BaseTimeEntity {
    
    @CreatedDate
    @Column(updatable = false, nullable = false)
    LocalDateTime createDate; // 엔티티 생성시간
    
    @LastModifiedDate
    @Column(nullable = false)
    LocalDateTime modifiedDate; // 엔티티 수정시간
}
