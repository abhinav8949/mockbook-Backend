package com.mocktest.model.contact;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Contact {
    private String name;
    private String mobile;
    private String email;
    private String subject;
    private String message;
}
