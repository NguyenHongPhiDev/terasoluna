package com.example.data1.domain.model;

import com.example.data1.domain.constant.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity(name = "Order")
@Table(name = "orders")
public class OrderModel extends BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}