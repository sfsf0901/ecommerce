package com.ecommerce.project.security.response;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoResponse {
    private Long id;
    private String username;
    private List<String> roles;
    private String jwtCookie;

    public UserInfoResponse(Long id, String username, List<String> roles, String jwtCookie) {
        this.id = id;
        this.username = username;
        this.roles = roles;
        this.jwtCookie = jwtCookie;
    }
}
