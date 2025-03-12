package com.SF.mainService.dto;

public class UserDetailsDto {
    private String username;
    private String passcode;

    public UserDetailsDto(String username, String passcode) {
        this.username = username;
        this.passcode = passcode;
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

    @Override
    public String toString() {
        return "UserDetailsDto{" +
                "username='" + username + '\'' +
                ", passcode='" + passcode + '\'' +
                '}';
    }
}
