package com.example.data1.app.welcome;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class LoginForm implements Serializable {
        @NotNull
        @NotEmpty
        private String username;

        @NotNull
        @NotEmpty
        private String password;

}
