package com.instagram.commons.exceptions;

public class RoleNotFoundException extends RuntimeException{
    public RoleNotFoundException(String roleName) {
        super("Role " + roleName + " not found.");
    }
}