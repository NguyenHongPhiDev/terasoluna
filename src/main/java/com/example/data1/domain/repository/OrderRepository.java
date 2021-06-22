package com.example.data1.domain.repository;

import com.example.data1.domain.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface OrderRepository extends JpaRepository<OrderModel, String> {

}
