package com.gla.library;
import com.gla.library.books.Book;
import com.gla.library.members.Member;
import com.gla.library.transactions.Transaction;
public class Runner {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Programming", "James Gosling");
        System.out.println("📘 New Book Added:");
        book1.displayBook();
        Member member1 = new Member(1, "Sakshi");
        System.out.println("\n👤 New Member Registered:");
        member1.displayMember();
        Transaction transaction = new Transaction();
        transaction.issueBook(book1, member1);
    }
}