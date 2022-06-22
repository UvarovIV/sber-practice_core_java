package OOP_part1.Task4;

public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author.getName();
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return String.format("Автор: %s, Название: %s, Год: %s", author.getName(), title, year);
    }
}
