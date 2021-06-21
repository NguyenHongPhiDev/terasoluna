package com.example.data1.domain.model;

import com.example.data1.domain.constant.UserStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity(name = "User")
@Table(name = "users")
public class UserModel extends BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "balance")
    private Integer balance;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private UserStatus status;

//    @ManyToMany
//    @JoinTable(name = "role_user",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id")
//    )
//    private Set<RoleModel> roles = new HashSet<>();
//
//    public void deduct(final Integer amount){
//        this.balance= this.balance - amount;
//    }
}