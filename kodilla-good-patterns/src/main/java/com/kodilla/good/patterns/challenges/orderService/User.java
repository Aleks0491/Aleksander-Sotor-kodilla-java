package com.kodilla.good.patterns.challenges.orderService;

public class User {

    private String firstName;
    private String lastName;
    private String userID;
    private String emailAddress;

    public User(String firstName, String lastName, String userID, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserID() {
        return userID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserID().equals(user.getUserID());
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void checkUser() {
        if(equals(false)) {
            System.out.println("You are not an registered user. You can register now or continue as quest.");
        }
    }
}
