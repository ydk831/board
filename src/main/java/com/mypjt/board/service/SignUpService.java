package com.mypjt.board.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypjt.board.model.dto.SignUpRequest;
import com.mypjt.board.model.dto.SignUpResponse;
import com.mypjt.board.model.entity.User;
import com.mypjt.board.model.repository.SignUpRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SignUpService {

    final SignUpRepository signUpRepository;
    // final PasswordEncoder encoder;

    @Transactional(readOnly = true)
    public SignUpResponse Inquire(String id) {
        Optional<User> resultDao = signUpRepository.findById(id);
        // SignUpResponse response = new SignUpResponse(resultDao.get().getId(),resultDao.get().getPassword(), resultDao.get().getCheckedPassword(), resultDao.get().getEmail(), resultDao.get().getProfile(), resultDao.get().getCreateDate(), resultDao.get().getModifiedDate());
        // return response;
        return SignUpResponse.builder()
                .id(resultDao.get().getId())
                .password(resultDao.get().getPassword())
                .checkedPassword(resultDao.get().getCheckedPassword())
                .email(resultDao.get().getEmail())
                .profile(resultDao.get().getProfile())
                .createDate(resultDao.get().getCreateDate())
                .modifiedDate(resultDao.get().getModifiedDate())
                .build();
    }

    @Transactional
    public SignUpResponse SignUp(SignUpRequest request) {
        
        // User userDao1 = new User(request.getId(), request.getPassword(), request.getCheckedPassword(), request.getEmail(), request.getProfile());
        User userDao = User.builder()
                        .id(request.getId())
                        .password(request.getPassword())
                        .checkedPassword(request.getCheckedPassword())
                        .email(request.getEmail())
                        .profile(request.getProfile())
                        .build();

        /*
        System.out.println("userDao:"+userDao.getCreateDate());
        if (signUpRepository.findById(userDao.getId()).isPresent()) {
            // 이미 존재하는 ID
            System.out.println("already exist");
            Optional<User> temp = signUpRepository.findById(userDao.getId());
            System.out.println(temp.get().getCreateDate());
        } 
        if (request.getPassword().equals(userDao.getCheckedPassword())) {
            // 비밀번호가 일치하지 않음
        }
        */
        
        User resultDao = signUpRepository.save(userDao);
        
        // 생성자 사용법
        // SignUpResponse res = new SignUpResponse(resultDao.getId(),resultDao.getPassword(), resultDao.getCheckedPassword(), resultDao.getEmail(), resultDao.getProfile(), resultDao.getCreateDate(), resultDao.getModifiedDate());
        // 빌더 사용법
        SignUpResponse response = SignUpResponse.builder()
                                .id(resultDao.getId())
                                .password(resultDao.getPassword())
                                .checkedPassword(resultDao.getCheckedPassword())
                                .email(resultDao.getEmail())
                                .profile(resultDao.getProfile())
                                .createDate(resultDao.getCreateDate())
                                .modifiedDate(resultDao.getModifiedDate())
                                .build();
        
        return response;
    }
}
