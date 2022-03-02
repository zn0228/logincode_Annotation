package com.example.logincode_annotation.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter//겟터 메서드 자동 생성
@NoArgsConstructor //기본 생성자 생성
public class UserDto {

    @NotBlank//널, 공백 값 예외처리
    private String name;

    @NotBlank
    private String pwd;

    @Builder//빌더 생성
    public UserDto(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

}
