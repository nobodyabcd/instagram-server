package com.instagram.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document(collection = "roles")
public class Role {
    @Id
    private String id;

    private ERole roleName;

    public Role() {}

    public Role(ERole roleName) {
        this.roleName = roleName;
    }
}