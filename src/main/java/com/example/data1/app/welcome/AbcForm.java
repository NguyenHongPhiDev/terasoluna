package com.example.data1.app.welcome;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class AbcForm implements Serializable {
    private static final long serialVersionUID = 1L;
    private String abc;

    private String abc1;
}
