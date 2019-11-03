package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    public final List<ForumUser> userList = new ArrayList<>();

    public Forum () {
        userList.add(new ForumUser("User1", 'M', 1925, 12, 5, 1, 5));
        userList.add(new ForumUser("User2", 'M', 2000, 02, 2, 2, 0));
        userList.add(new ForumUser("User3", 'F', 1995, 3, 6, 3, 6));
        userList.add(new ForumUser("User4", 'F', 2004, 9, 3, 4, 6));
        userList.add(new ForumUser("User5", 'M', 1987, 5, 1, 5, 1));
        userList.add(new ForumUser("User6", 'M', 1999, 6, 12, 6, 16));
        userList.add(new ForumUser("User7", 'F', 2003, 3, 3, 7, 9));
        userList.add(new ForumUser("User8", 'M', 1994, 8, 29, 8, 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
