package com.example.data1.domain.repository;

import com.example.data1.domain.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

    @Query(
            value = " SELECT p FROM products p " +
                    " WHERE p.id = ?1 "
    )
    Optional<ProductModel> findProductModelById(Integer id);
}
