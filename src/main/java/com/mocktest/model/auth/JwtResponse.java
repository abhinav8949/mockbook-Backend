package com.mocktest.model.auth;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class JwtResponse {
    private String token;
    private String username;
}
