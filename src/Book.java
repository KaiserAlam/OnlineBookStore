public class Book{

    private String title;
    private String author;
    private Person person;

    public Book(String title) {
        this.title = title;
        this.author = "unknown";
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}