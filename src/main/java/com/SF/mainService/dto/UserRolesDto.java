package com.SF.mainService.dto;

public class UserRolesDto {
    private String userRole;

    public UserRolesDto(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserRolesDto{" +
                "userRole='" + userRole + '\'' +
                '}';
    }
}
