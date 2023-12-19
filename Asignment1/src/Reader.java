package Asignment1;

import java.util.Arrays;

public class Reader {
    String FULL_NAME;
    short licardnum;
    String faculty;
    String dateofbirth;
    String phone;
    String[] arr;

    public void takeBook(int n) {
        System.out.println("Petrov VV took " + n + " books");
    }
    public void takeBook(String... books) {
        System.out.println("Petrov VV took books: " + Arrays.toString(books));
    }
    public void returnBook(String... books) {
        System.out.println("Petrov VV returned the books: " + Arrays.toString(books));
    }
    public void returnBook(int n) {
        System.out.println("V. V. Petrov returned: " + n + " books");
    }
}
