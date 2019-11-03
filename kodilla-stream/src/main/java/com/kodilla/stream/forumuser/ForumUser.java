package com.kodilla.stream.forumuser;

import java.text.Format;
import java.time.LocalDate;
import java.util.Formatter;

public final class ForumUser {
    private final String userName;
    private final char sex;
    private LocalDate birthDate = null;
    private final int userID;
    private final int postsQuantity;

    public ForumUser(final String userName,final char sex, final int yearOfBirth, final int monthOfBirth,
                     final int dayOfBirth, final int userID, final int postsQuantity) {
        this.userName = userName;
        this.birthDate = birthDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.userID = userID;
        this.postsQuantity = postsQuantity;
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getUserID() {
        return userID;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }


    public String toString() {
        return "ForumUser {" + userName + ", " + userID + ", " + sex + ", " + birthDate + ", " + postsQuantity + "}";
    }
}
