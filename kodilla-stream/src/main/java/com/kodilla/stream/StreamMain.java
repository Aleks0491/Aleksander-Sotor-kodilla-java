//package com.kodilla.stream;
//
//import com.kodilla.stream.book.Book;
//import com.kodilla.stream.book.BookDirectory;
//import com.kodilla.stream.forumuser.Forum;
//import com.kodilla.stream.forumuser.ForumUser;
//import com.kodilla.stream.person.People;
//import jdk.swing.interop.SwingInterOpUtils;
//import org.w3c.dom.ls.LSOutput;
//
//import java.lang.String;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//
//public class StreamMain {
//    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//        System.out.println(" ");
//
//        //Request 7.3
//        Forum forum = new Forum();
//        Map<Integer, ForumUser> theResultMap = (Map<Integer, ForumUser>) forum.userList.stream()
//                .filter(forumUser -> forumUser.getSex() == 'M')
//                .filter(forumUser -> forumUser.getBirthDate().getYear() < 1999 )
//                .filter(forumUser -> forumUser.getPostsQuantity() > 0)
//                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
//        System.out.println("The result: " + theResultMap.size());
//        theResultMap.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//    }
//}
