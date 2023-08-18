package lesson1;

public class Author {
    private String lastNameAuthor;
    private  String ferstNameAuthor;
    public Author(String ferstNameAuthor,String lastNameAuthor){
        this.ferstNameAuthor=ferstNameAuthor;
        this.lastNameAuthor=lastNameAuthor;
    }
    public String getFerstNameAuthor(){
        return this.ferstNameAuthor;
    }
    public String getLastNameAuthor(){
        return this.lastNameAuthor;
    }
}
