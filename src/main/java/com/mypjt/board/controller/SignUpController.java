package com.mypjt.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mypjt.board.model.dto.SignUpRequest;
import com.mypjt.board.model.dto.SignUpResponse;
import com.mypjt.board.service.SignUpService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SignUpController {

    final SignUpService signUpService;

    @GetMapping("/signup")
    public ResponseEntity<SignUpResponse> Inquire(@RequestParam(name="id", required=false) String id) {
        if (id == null) {
            return ResponseEntity.ok().body(null);
        }

        SignUpResponse responseBody = signUpService.Inquire(id);

        return ResponseEntity.ok().body(responseBody);
    }

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponse> SignUp(@RequestBody SignUpRequest request) {
        // HttpHeaders headers = new HttpHeaders();
        // headers.set("Key","Value");       

        SignUpResponse responseBody = signUpService.SignUp(request);
                
        //return new ResponseEntity<SignUpResponse>(responseBody, headers, HttpStatus.valueOf(200));
        // return ResponseEntity.ok().headers(headers).body(responseBody);
        return ResponseEntity.ok().body(responseBody);
    }    
}
