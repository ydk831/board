package com.mypjt.board.model.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SignUpResponse {
    String id;
    String password;
    String checkedPassword; // 회원 가입시 비밀번호 확인 용
    String email;
    String profile;    
    LocalDateTime createDate; // 엔티티 생성시간
    LocalDateTime modifiedDate; // 엔티티 수정시간
}
