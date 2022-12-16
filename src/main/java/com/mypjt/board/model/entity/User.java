package com.mypjt.board.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@Entity
@NoArgsConstructor // entity는 기본 생성자가 꼭 필요하다.
public class User extends BaseTimeEntity{
    @Id 
    String id;

    @Column(nullable = false, length = 100)
    String password;
    @Column(nullable = false, length = 100)
    String checkedPassword;

    @Column(nullable = false, length = 100)
    String email;
    @Column(nullable = true, length = 4000)
    String profile;

    /*
    public void encodePassword(PasswordEncoder encoder) {
        this.password = encoder.encode(password);
    }
    */
}
