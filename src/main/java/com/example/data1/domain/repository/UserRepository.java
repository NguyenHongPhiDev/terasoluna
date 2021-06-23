package com.example.data1.domain.repository;

import com.example.data1.domain.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

//    @Query(
//            value = " SELECT u FROM User u " +
//                    " WHERE u.username = ?1 "
//    )
//    @Transactional(readOnly = true)
//    Optional<UserModel> findByUsername(String username);
  @Query(
            value = " SELECT u FROM User u " +
                    " JOIN FETCH u.roles r " +
                    " JOIN FETCH r.permissions " +
                    " WHERE u.username = ?1 "
    )
//    @Transactional(readOnly = true)
    Optional<UserModel> findByUsername(String username);
}