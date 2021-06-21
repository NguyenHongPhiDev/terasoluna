package com.example.data1.app.welcome;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class LoginForm implements Serializable {
        private static final long serialVersionUID = 1L;
        @NotBlank
        private String username;

        @NotBlank
        private String password;


}
