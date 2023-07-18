package com.mocktest.controller.response;

import lombok.*;
import org.springframework.http.HttpStatusCode;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GenericResponse {

    private String msg;
    private Object objResponse;
    private HttpStatusCode responseCode;

}
