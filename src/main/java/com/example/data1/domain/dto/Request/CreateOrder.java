package com.example.data1.domain.dto.Request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateOrder {
    @NotNull(message = "product_id  is required!")
    private Integer productId;
//    @NotBlank(message = "User_id is required!")
    private String userId;
}
