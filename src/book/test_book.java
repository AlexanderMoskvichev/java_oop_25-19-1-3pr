package book;

import java.lang.*;
public class test_book {
    public static void main(String[] args) {
        book d1 = new book("Mike", 358);
        book d2 = new book("Helen", 210);
        book d3 = new book("Bob", 100);
        d1.UnreadPages();
        d2.UnreadPages();
        d3.UnreadPages();
    }
}