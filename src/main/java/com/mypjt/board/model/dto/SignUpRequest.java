package com.mypjt.board.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SignUpRequest {
    String id;
    String password;
    String checkedPassword; // 회원 가입시 비밀번호 확인 용
    String email;
    String profile;    
}
