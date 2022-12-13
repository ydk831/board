package com.mypjt.board.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class SignUpRequest {
    String id;
    String password;
    String checkedPassword; // 회원 가입시 비밀번호 확인 용
    String email;
    String profile;    
}
