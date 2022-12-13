package com.mypjt.board.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
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
