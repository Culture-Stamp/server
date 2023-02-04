package com.culturestamp.back.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.culturestamp.back.oauth.BaseTimeEntity;
import com.culturestamp.back.oauth.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Builder
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseTimeEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId = null;

    @Column(name = "social_id")
    private Long socialId;

    @Column(nullable = false)
    private String email;

    @Column(name = "nick_name")
    private String nickName;

    private String picture;


    private String status;

    private String follower;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;


}

