package com.example.data1.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity(name = "Role")
@Table(name = "roles")
public class RoleModel extends BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "roles")
    private Set<PermissionModel> permissions = new HashSet<>();
    
    @ManyToMany(mappedBy = "roles")
    private Set<UserModel> users = new HashSet<>();
}