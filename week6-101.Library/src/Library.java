
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        String print = "";
        for (Book book : books){
            print = book.title() + ", " + book.publisher() + ", " + book.year();
            System.out.println(print);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
            for (Book book : books){
                if(StringUtils.included(book.title(), title)) {
                // if (book.title().contains(title)){
                    // Book found!
                    found.add(book);
                }
            }
        return found;
    }

//    public ArrayList<Book> searchByTitle(String title) {
//        ArrayList<Book> found = new ArrayList<Book>();
//
//        for (int i = 0; i < this.books.size(); i++) {
//            if (StringUtils.included(this.books.get(i).title(), title)) {
//                //if (this.library.get(i).title().contains(title)) {
//                found.add(this.books.get(i));
//            }
//        }
//        return found;
//    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : books){
            if(StringUtils.included(book.publisher(), publisher)) {
            //if (book.publisher().contains(publisher)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : books){
            if (book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
}
