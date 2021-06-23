package com.example.data1.domain.model;

import com.example.data1.domain.constant.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity(name = "User")
@Table(name = "users")
@AllArgsConstructor
public class UserModel extends BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @NotBlank
    @Column(name = "username")
    private String username;

    @NotBlank
    @Column(name = "password")
    private String password;

    @Column(name = "balance")
    private Integer balance;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    public UserModel() {

    }

    @ManyToMany
    @JoinTable(name = "role_user",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<RoleModel> roles = new HashSet<>();

    public void deduct(final Integer amount){
        this.balance= this.balance - amount;
    }
}