package lesson1;

public class Main {
    public static void main(String[] args) {
    Author author1=new Author("Lev","Tolstoiy");
    Book book1= new Book("War and Peace",author1,1798);
    Author author2=new Author("Nikolai","Gogol");
    Book book2= new Book("Dead Souls",author2,1830);
    book2.setCreatYear(1828);
    }
}
