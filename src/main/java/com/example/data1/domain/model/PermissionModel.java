package com.example.data1.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity(name = "Permission")
@Table(name = "permissions")
public class PermissionModel extends BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(name = "permission_role",
            joinColumns = @JoinColumn(name = "permission_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<RoleModel> roles = new HashSet<>();
}