package com.SpringSystem.model;
class User {
private String UserId;
private String email;
User(String UserId, String email) {
    this.UserId = UserId;
    this.email = email;
}

public String getValue() {
    return "UserId "+ UserId + " Email "+email;
}
}
public class StringExample {

    public static void main(String[] args) {
User user = new User("Sonu@123", "sonu@gamil.com");
        System.out.println(user.getValue());
    }
}
