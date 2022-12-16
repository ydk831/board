package com.mypjt.board.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@SuperBuilder
@NoArgsConstructor // entity는 기본 생성자가 꼭 필요하다
public abstract class BaseTimeEntity {
    
    @Column(updatable=false, nullable=false)
    @CreatedDate
    protected LocalDateTime createDate; // 엔티티 생성시간
    
    @Column(nullable = false)
    @LastModifiedDate
    protected LocalDateTime modifiedDate; // 엔티티 수정시간
}
