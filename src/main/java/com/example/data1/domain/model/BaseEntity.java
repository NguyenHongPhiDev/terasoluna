package com.example.data1.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class BaseEntity implements Serializable {
        @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

        @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
