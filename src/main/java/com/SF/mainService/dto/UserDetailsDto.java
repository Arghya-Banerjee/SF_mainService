package com.SF.mainService.dto;

public class UserDetailsDto {
    private String username;
    private String passcode;
    private String userRole;

    public UserDetailsDto(String username, String passcode, String userRole) {
        this.username = username;
        this.passcode = passcode;
        this.userRole = userRole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserDetailsDto{" +
                "username='" + username + '\'' +
                ", passcode='" + passcode + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
