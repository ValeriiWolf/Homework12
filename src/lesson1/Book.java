package lesson1;

public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int creatYear;

    public Book(String nameBook, Author nameAuthor, int creatYear) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.creatYear = creatYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getNameAuthor() {
        return nameAuthor;
    }

    public int getCreatYear() {
        return creatYear;
    }

    public void setCreatYear(int creatYear) {
        this.creatYear = creatYear;
    }
}
