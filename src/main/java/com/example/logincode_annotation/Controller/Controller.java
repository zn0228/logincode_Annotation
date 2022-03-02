package com.example.logincode_annotation.Controller;

// class
import com.example.logincode_annotation.Dto.UserDto;
import com.example.logincode_annotation.Service.UserService;

// lombok
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;

// 어노테이션
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

// validation
import javax.validation.Valid;

@RequiredArgsConstructor //생성자 선언 없이 생성자 주입
@RestController// 데이터로 클라이언트에게 반환하는 컨트롤러
public class Controller {

    private final UserService userService;

    @PostMapping("/join")//해당 url을 메서드와 매핑(post 방식)
    @ResponseStatus(HttpStatus.CREATED)//응답의 상태코드 지정
    public void join(@RequestBody @Valid UserDto userDto) {
        userService.saveData(userDto);
    }
    //json데이터 받아오기 // 값의 유효성 검사

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.CREATED)// 201
    public UserDto login(@RequestBody @Valid UserDto userDto) {
        return userService.login(userDto);
    }

    @GetMapping("/login/{name}/exists")
    @ResponseStatus(HttpStatus.OK)// 200
    private void exists(@PathVariable String name) {
        userService.exists(name);
    }
    //url경로에 변수넣기


}
