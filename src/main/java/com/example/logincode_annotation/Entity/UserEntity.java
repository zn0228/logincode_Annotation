package com.example.logincode_annotation.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity//jpa에 관리 | 테이블과 매핑할 클래스로 만듦
@Getter
@Builder
@AllArgsConstructor//모든 필드값을 매개변수로 받는 생성자생성
@NoArgsConstructor
@Table(name = "user")//엔티티와 매핑할 테이블 지정
public class UserEntity {

    @Id//기본키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)//기본키 자동할당
    private Long id;

    @Column(nullable = false)// 객체 필드와 DB 테이블 컬럼 매핑 - nullable 널값의 허용여부 결정
    private String name;

    @Column(nullable = false)
    private String pwd;


}
